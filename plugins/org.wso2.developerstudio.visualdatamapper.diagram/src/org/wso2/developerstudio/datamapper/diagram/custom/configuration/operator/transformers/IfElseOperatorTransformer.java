/*
 * Copyright 2016 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.datamapper.diagram.custom.configuration.operator.transformers;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.wso2.developerstudio.datamapper.SchemaDataType;
import org.wso2.developerstudio.datamapper.diagram.custom.generator.DifferentLevelArrayMappingConfigGenerator;
import org.wso2.developerstudio.datamapper.diagram.custom.generator.ForLoopBean;
import org.wso2.developerstudio.datamapper.diagram.custom.model.DMOperation;
import org.wso2.developerstudio.datamapper.diagram.custom.model.DMVariable;
import org.wso2.developerstudio.datamapper.diagram.custom.util.ScriptGenerationUtil;

/**
 * This class extended from the {@link AbstractDMOperatorTransformer} abstract
 * class and generate script for IfElse operation
 */
public class IfElseOperatorTransformer extends AbstractDMOperatorTransformer {

	@Override
	public String generateScriptForOperation(Class<?> generatorClass, List<DMVariable> inputVariables,
			List<DMVariable> outputVariables, Map<String, List<SchemaDataType>> variableTypeMap,
			Stack<ForLoopBean> parentForLoopBeanStack, DMOperation operator) {
		StringBuilder operationBuilder = new StringBuilder();
		if (DifferentLevelArrayMappingConfigGenerator.class.equals(generatorClass)) {
			@SuppressWarnings("unchecked")
			Stack<ForLoopBean> tempParentForLoopBeanStack = (Stack<ForLoopBean>) parentForLoopBeanStack.clone();
			if (inputVariables.get(0) == null) {
				throw new IllegalArgumentException("If Else operator should have a condition specified");
			}
			if (inputVariables.size() >= 2) {
				operationBuilder.append(
						appendOutputVariable(operator, outputVariables, variableTypeMap, parentForLoopBeanStack));
				operationBuilder
						.append("(" + ScriptGenerationUtil.getPrettyVariableNameInForOperation(inputVariables.get(0),
								variableTypeMap, parentForLoopBeanStack, true) + ")");
				if (inputVariables.get(1) != null) {
					operationBuilder.append("?(" + ScriptGenerationUtil.getPrettyVariableNameInForOperation(
							inputVariables.get(1), variableTypeMap, tempParentForLoopBeanStack, true) + ")");
				} else {
					operationBuilder.append("?(" + ScriptGenerationUtil.getPrettyVariableNameInForOperation(
							outputVariables.get(0), variableTypeMap, tempParentForLoopBeanStack, true) + ")");
				}
				if (inputVariables.size() > 2 && inputVariables.get(2) != null) {
					operationBuilder.append(":(" + ScriptGenerationUtil.getPrettyVariableNameInForOperation(
							inputVariables.get(2), variableTypeMap, tempParentForLoopBeanStack, true) + ")");
				} else {
					operationBuilder.append(":(" + ScriptGenerationUtil.getPrettyVariableNameInForOperation(
							outputVariables.get(0), variableTypeMap, tempParentForLoopBeanStack, true) + ")");
				}
				operationBuilder.append(";");
			} else{
				throw new IllegalArgumentException("If Else operator should have at least one branch.");
			}
		} else {
			throw new IllegalArgumentException("Unknown MappingConfigGenerator type found : " + generatorClass);
		}
		return operationBuilder.toString();
	}

}
