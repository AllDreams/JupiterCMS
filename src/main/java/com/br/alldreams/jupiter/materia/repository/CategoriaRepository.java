/**
 *
 */
package com.br.alldreams.jupiter.materia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.alldreams.jupiter.materia.repository.model.Categoria;

/**
 * @author Jess
 * @since 11 de jan de 2020 02:25:49
 * @version 1.0
 */
@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, String> {

}
