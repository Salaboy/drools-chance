/*
 * Copyright 2009 Solnet Solutions Limited (http://www.solnetsolutions.co.nz/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.informer.domain;

import org.drools.informer.Question;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple straight-through Domain Model Adapter for use with classes that are directly supported by
 * <code>org.tohu.Question</code> and don't require any class conversion e.g. <code>java.lang.String</code>
 * 
 * @author Damon Horrell
 */
public class StraightThroughDomainModelAdapter implements DomainModelAdapter {

	private Question.QuestionType answerType;

	private Class<?> clazz;

	public StraightThroughDomainModelAdapter(Question.QuestionType answerType, Class<?> clazz) {
		this.answerType = answerType;
		this.clazz = clazz;
	}

	/**
	 * @see org.drools.informer.domain.DomainModelAdapter#getSupportedClasses()
	 */
	public Set<Class<?>> getSupportedClasses() {
		return new HashSet<Class<?>>(Collections.singleton(clazz));
	}

	/**
	 * @see org.drools.informer.domain.DomainModelAdapter#getAnswerType()
	 */
	public Question.QuestionType getAnswerType() {
		return answerType;
	}

	/**
	 * @see org.drools.informer.domain.DomainModelAdapter#answerToObject(Object, Class)
	 */
	public Object answerToObject(Object answer, Class<?> clazz) {
		return answer;
	}

	/**
	 * @see org.drools.informer.domain.DomainModelAdapter#objectToAnswer(Object)
	 */
	public Object objectToAnswer(Object object) {
		return object;
	}

}
