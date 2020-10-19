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
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.CalculatorMediatorProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.CallMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.ServiceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculator Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalculatorMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalculatorMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalculatorMediatorImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CalculatorMediatorImpl#getCalculatorMediatorProperties <em>Calculator Mediator Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatorMediatorImpl extends MediatorImpl implements CalculatorMediator {
    /**
     * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputConnector()
     * @generated
     * @ordered
     */
    protected CalculatorMediatorInputConnector inputConnector;

    /**
     * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputConnector()
     * @generated
     * @ordered
     */
    protected CalculatorMediatorOutputConnector outputConnector;

    /**
     * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated
     * @ordered
     */
    protected static final ServiceType SERVICE_TYPE_EDEFAULT = ServiceType.BODY;

    /**
     * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated
     * @ordered
     */
    protected ServiceType serviceType = SERVICE_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCalculatorMediatorProperties() <em>Calculator Mediator Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculatorMediatorProperties()
     * @generated
     * @ordered
     */
    protected EList<CalculatorMediatorProperty> calculatorMediatorProperties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CalculatorMediatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.CALCULATOR_MEDIATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CalculatorMediatorInputConnector getInputConnector() {
        return inputConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputConnector(CalculatorMediatorInputConnector newInputConnector, NotificationChain msgs) {
        CalculatorMediatorInputConnector oldInputConnector = inputConnector;
        inputConnector = newInputConnector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputConnector(CalculatorMediatorInputConnector newInputConnector) {
        if (newInputConnector != inputConnector) {
            NotificationChain msgs = null;
            if (inputConnector != null)
                msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR, null, msgs);
            if (newInputConnector != null)
                msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR, null, msgs);
            msgs = basicSetInputConnector(newInputConnector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CalculatorMediatorOutputConnector getOutputConnector() {
        return outputConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputConnector(CalculatorMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
        CalculatorMediatorOutputConnector oldOutputConnector = outputConnector;
        outputConnector = newOutputConnector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputConnector(CalculatorMediatorOutputConnector newOutputConnector) {
        if (newOutputConnector != outputConnector) {
            NotificationChain msgs = null;
            if (outputConnector != null)
                msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
            if (newOutputConnector != null)
                msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
            msgs = basicSetOutputConnector(newOutputConnector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceType(ServiceType newServiceType) {
        ServiceType oldServiceType = serviceType;
        serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CALCULATOR_MEDIATOR__SERVICE_TYPE, oldServiceType, serviceType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CalculatorMediatorProperty> getCalculatorMediatorProperties() {
        if (calculatorMediatorProperties == null) {
            calculatorMediatorProperties = new EObjectContainmentEList<CalculatorMediatorProperty>(CalculatorMediatorProperty.class, this, EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES);
        }
        return calculatorMediatorProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR:
                return basicSetInputConnector(null, msgs);
            case EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR:
                return basicSetOutputConnector(null, msgs);
            case EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES:
                return ((InternalEList<?>)getCalculatorMediatorProperties()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR:
                return getInputConnector();
            case EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR:
                return getOutputConnector();
            case EsbPackage.CALCULATOR_MEDIATOR__SERVICE_TYPE:
                return getServiceType();
            case EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES:
                return getCalculatorMediatorProperties();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR:
                setInputConnector((CalculatorMediatorInputConnector)newValue);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR:
                setOutputConnector((CalculatorMediatorOutputConnector)newValue);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__SERVICE_TYPE:
                setServiceType((ServiceType)newValue);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES:
                getCalculatorMediatorProperties().clear();
                getCalculatorMediatorProperties().addAll((Collection<? extends CalculatorMediatorProperty>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR:
                setInputConnector((CalculatorMediatorInputConnector)null);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR:
                setOutputConnector((CalculatorMediatorOutputConnector)null);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__SERVICE_TYPE:
                setServiceType(SERVICE_TYPE_EDEFAULT);
                return;
            case EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES:
                getCalculatorMediatorProperties().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EsbPackage.CALCULATOR_MEDIATOR__INPUT_CONNECTOR:
                return inputConnector != null;
            case EsbPackage.CALCULATOR_MEDIATOR__OUTPUT_CONNECTOR:
                return outputConnector != null;
            case EsbPackage.CALCULATOR_MEDIATOR__SERVICE_TYPE:
                return serviceType != SERVICE_TYPE_EDEFAULT;
            case EsbPackage.CALCULATOR_MEDIATOR__CALCULATOR_MEDIATOR_PROPERTIES:
                return calculatorMediatorProperties != null && !calculatorMediatorProperties.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (serviceType: ");
        result.append(serviceType);
        result.append(')');
        return result.toString();
    }

} //CalculatorMediatorImpl
