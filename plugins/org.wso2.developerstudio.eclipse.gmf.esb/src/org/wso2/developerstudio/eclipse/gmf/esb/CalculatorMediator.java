/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getCalculatorMediatorProperties <em>Calculator Mediator Properties</em>}</li>
 * </ul>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getCalculatorMediator()
 * @model
 * @generated
 */
public interface CalculatorMediator extends Mediator {
    /**
     * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Connector</em>' containment reference.
     * @see #setInputConnector(CalculatorMediatorInputConnector)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getCalculatorMediator_InputConnector()
     * @model containment="true"
     * @generated
     */
    CalculatorMediatorInputConnector getInputConnector();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getInputConnector <em>Input Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Connector</em>' containment reference.
     * @see #getInputConnector()
     * @generated
     */
    void setInputConnector(CalculatorMediatorInputConnector value);

    /**
     * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Connector</em>' containment reference.
     * @see #setOutputConnector(CalculatorMediatorOutputConnector)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getCalculatorMediator_OutputConnector()
     * @model containment="true"
     * @generated
     */
    CalculatorMediatorOutputConnector getOutputConnector();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getOutputConnector <em>Output Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Connector</em>' containment reference.
     * @see #getOutputConnector()
     * @generated
     */
    void setOutputConnector(CalculatorMediatorOutputConnector value);

    /**
     * Returns the value of the '<em><b>Service Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.ServiceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.ServiceType
     * @see #setServiceType(ServiceType)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getCalculatorMediator_ServiceType()
     * @model
     * @generated
     */
    ServiceType getServiceType();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator#getServiceType <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.ServiceType
     * @see #getServiceType()
     * @generated
     */
    void setServiceType(ServiceType value);

    /**
     * Returns the value of the '<em><b>Calculator Mediator Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediatorProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculator Mediator Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculator Mediator Properties</em>' containment reference list.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getCalculatorMediator_CalculatorMediatorProperties()
     * @model containment="true"
     * @generated
     */
    EList<CalculatorMediatorProperty> getCalculatorMediatorProperties();

} // CalculatorMediator
