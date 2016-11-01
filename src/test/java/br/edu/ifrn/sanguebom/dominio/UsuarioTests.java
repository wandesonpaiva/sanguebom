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
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UsuarioTests {

	@Test
	public void compareTo() {
		Set<Usuario> usuarios = new TreeSet<>();		
		Usuario usuario1 = Usuario.builder().nome("Wandeson Paiva").email("wandeson.jpaiva@gmail.com").build();
		usuarios.add(usuario1);
		Usuario usuario2 = Usuario.builder().nome("Pedro Lucas").email("pedro.lucas@gmail.com").build();
		usuarios.add(usuario2);

		assertThat(usuarios.iterator().next()).isEqualTo(usuario2);

	}

}