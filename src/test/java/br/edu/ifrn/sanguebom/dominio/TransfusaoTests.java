/*
 * Copyright 2016-2016 the original author or authors.
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

package br.edu.ifrn.sanguebom.dominio;

//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
import java.util.Date;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TransfusaoTests {
	private static final String NOME1 = "WANDESON PAIVA";
	private static final String NOME2 = "PEDRO LUCAS";
	private static final String EMAIL1 = "wandeson.jpaiva@gmail.com";
	private static final String EMAIL2 = "pedro.lucas@gmail.com";
	private Date data1 = new Date();
	private Date data2 = new Date();


	@Test
	public void transfusaoIgual() {
		assertThat(Transfusao.builder().receptor(Usuario.builder().nome(NOME2).email(EMAIL2).build()).data(data1).quantidade(500).build())
			.isEqualTo(Transfusao.builder().receptor(Usuario.builder().nome(NOME2).email(EMAIL2).build()).data(data1).quantidade(500).build());
	}

	@Test
	public void transfusaoDiferente() {
		assertThat(Transfusao.builder().receptor(Usuario.builder().nome(NOME2).email(EMAIL2).build()).data(data1).quantidade(500).build())
			.isNotEqualTo(Transfusao.builder().receptor(Usuario.builder().nome(NOME1).email(EMAIL1).build()).data(data2).quantidade(800).build());
	}

	@Test
	public void compareTo() {
		//Set<Transfusao> transfusoes = new TreeSet<>();
		//Transfusao transfusao1 = Transfusao.builder().data();
	}

}
