/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Properties;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.synapse.Mediator;
import org.apache.synapse.config.xml.SequenceMediatorFactory;
import org.apache.synapse.config.xml.XMLConfigConstants;
import org.wso2.carbon.identity.entitlement.mediator.EntitlementConstants;
import org.wso2.carbon.identity.entitlement.mediator.config.xml.EntitlementMediatorFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.EntitlementMediatorExt;

public class EntitlementMediatorExtFactory extends EntitlementMediatorFactory {

    public Mediator createSpecificMediator(OMElement element, Properties properties) {

        EntitlementMediatorExt mediator = null;
        OMAttribute remoteServiceUrl = null;
        OMAttribute remoteServiceUserName = null;
        OMAttribute remoteServicePassword = null;
        OMAttribute callbackClass = null;
        OMAttribute cacheType = null;
        OMAttribute invalidationInterval = null;
        OMAttribute maxCacheEntries = null;
        OMAttribute basicAuth = null;
        OMAttribute thriftHost = null;
        OMAttribute thriftPort = null;
        OMAttribute reuseSession = null;
        OMAttribute client = null;

        mediator = new EntitlementMediatorExt();

        remoteServiceUrl = element.getAttribute(EntitlementConstants.ATTR_SERVER_URL);
        if (remoteServiceUrl != null && remoteServiceUrl.getAttributeValue() != null) {
            mediator.setRemoteServiceUrl(remoteServiceUrl.getAttributeValue());
        }

        remoteServiceUserName = element.getAttribute(EntitlementConstants.ATTR_USER_NAME);
        if (remoteServiceUserName != null && remoteServiceUserName.getAttributeValue() != null) {
            mediator.setRemoteServiceUserName(remoteServiceUserName.getAttributeValue());
        }

        remoteServicePassword = element.getAttribute(EntitlementConstants.ATTR_NAME_PASSWORD);
        if (remoteServicePassword != null && remoteServicePassword.getAttributeValue() != null) {
            mediator.setRemoteServicePassword(remoteServicePassword.getAttributeValue());
        }

        callbackClass = element.getAttribute(EntitlementConstants.ATTR_CALLBACK_CLASS);
        if (callbackClass != null && callbackClass.getAttributeValue() != null) {
            mediator.setCallbackClass(callbackClass.getAttributeValue());
        }

        cacheType = element.getAttribute(EntitlementConstants.ATTR_CACHE_TYPE);
        if (cacheType != null && cacheType.getAttributeValue() != null) {
            mediator.setCacheType(cacheType.getAttributeValue());
        }

        invalidationInterval = element.getAttribute(EntitlementConstants.ATTR_INVALIDATION_INTERVAL);
        if (invalidationInterval != null && invalidationInterval.getAttributeValue() != null) {
            mediator.setInvalidationInterval(Integer.parseInt(invalidationInterval.getAttributeValue()));
        }

        maxCacheEntries = element.getAttribute(EntitlementConstants.ATTR_MAX_CACHE_ENTRIES);
        if (maxCacheEntries != null && maxCacheEntries.getAttributeValue() != null) {
            mediator.setMaxCacheEntries(Integer.parseInt(maxCacheEntries.getAttributeValue()));
        }

        thriftHost = element.getAttribute(EntitlementConstants.ATTR_THRIFT_HOST);
        if (thriftHost != null && thriftHost.getAttributeValue() != null) {
            mediator.setThriftHost(thriftHost.getAttributeValue());
        }

        thriftPort = element.getAttribute(EntitlementConstants.ATTR_THRIFT_PORT);
        if (thriftPort != null && thriftPort.getAttributeValue() != null) {
            mediator.setThriftPort(thriftPort.getAttributeValue());
        }

        reuseSession = element.getAttribute(EntitlementConstants.ATTR_REUSE_SESSION);
        if (reuseSession != null && reuseSession.getAttributeValue() != null) {
            mediator.setReuseSession(reuseSession.getAttributeValue());
        }

        client = element.getAttribute(EntitlementConstants.ATTR_CLIENT);
        if (client != null && client.getAttributeValue() != null) {
            mediator.setClient(client.getAttributeValue());
        }

        SequenceMediatorFactory mediatorFactory = new SequenceMediatorFactory();
        OMAttribute onReject = element
                .getAttribute(new QName(XMLConfigConstants.NULL_NAMESPACE, XMLConfigConstants.ONREJECT));
        if (onReject != null) {
            String onRejectValue = onReject.getAttributeValue();
            if (onRejectValue != null) {
                mediator.setOnRejectSeqKey(onRejectValue.trim());
            }
        } else {
            OMElement onRejectMediatorElement = element.getFirstChildWithName(
                    new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, XMLConfigConstants.ONREJECT));
            if (onRejectMediatorElement != null) {
                mediator.setOnRejectMediator(
                        mediatorFactory.createAnonymousSequence(onRejectMediatorElement, properties));
            }
        }
        OMAttribute onAccept = element
                .getAttribute(new QName(XMLConfigConstants.NULL_NAMESPACE, XMLConfigConstants.ONACCEPT));
        if (onAccept != null) {
            String onAcceptValue = onAccept.getAttributeValue();
            if (onAcceptValue != null) {
                mediator.setOnAcceptSeqKey(onAcceptValue);
            }
        } else {
            OMElement onAcceptMediatorElement = element.getFirstChildWithName(
                    new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, XMLConfigConstants.ONACCEPT));
            if (onAcceptMediatorElement != null) {
                mediator.setOnAcceptMediator(
                        mediatorFactory.createAnonymousSequence(onAcceptMediatorElement, properties));
            }
        }
        OMAttribute obligations = element.getAttribute(new QName(XMLConfigConstants.NULL_NAMESPACE, OBLIGATIONS));
        if (obligations != null) {
            String obligationsValue = obligations.getAttributeValue();
            if (obligationsValue != null) {
                mediator.setObligationsSeqKey(obligationsValue.trim());
            }
        } else {
            OMElement obligationsMediatorElement = element
                    .getFirstChildWithName(new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, OBLIGATIONS));
            if (obligationsMediatorElement != null) {
                mediator.setObligationsMediator(
                        mediatorFactory.createAnonymousSequence(obligationsMediatorElement, properties));
            }
        }
        OMAttribute advice = element.getAttribute(new QName(XMLConfigConstants.NULL_NAMESPACE, ADVICE));
        if (advice != null) {
            String adviceValue = advice.getAttributeValue();
            if (adviceValue != null) {
                mediator.setAdviceSeqKey(adviceValue.trim());
            }
        } else {
            OMElement adviceMediatorElement = element
                    .getFirstChildWithName(new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, ADVICE));
            if (adviceMediatorElement != null) {
                mediator.setAdviceMediator(mediatorFactory.createAnonymousSequence(adviceMediatorElement, properties));
            }
        }
        addAllCommentChildrenToList(element, mediator.getCommentsList());

        return mediator;
    }
}
