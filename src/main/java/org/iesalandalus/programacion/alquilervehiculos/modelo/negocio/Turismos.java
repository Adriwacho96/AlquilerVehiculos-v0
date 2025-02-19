package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;

public class Turismos {
	List<Turismo> turismo;

	public Turismos() {

		turismo = new ArrayList<>();
	}

	public List<Turismo> get() {

		return turismo;
	}

	public int getCantidad() {
		int cantidadElementos = 0;

		cantidadElementos = turismo.size();
		return cantidadElementos;
	}

	public void insertar(Turismo turismo) throws OperationNotSupportedException {

		if (turismo == null) {
			throw new NullPointerException("ERROR: No se puede insertar un turismo nulo.");
		}
		if (!this.turismo.contains(turismo)) {
			this.turismo.add(turismo);
		} else {
			throw new OperationNotSupportedException("ERROR: Ya existe un turismo con esa matrícula.");
		}

	}

	public Turismo buscar(Turismo turismo) {
		if (turismo == null) {
			throw new NullPointerException("ERROR: No se puede buscar un turismo nulo.");
		}
		if (this.turismo.contains(turismo)) {
			return turismo;
		} else {
			return null;
		}

	}

	public void borrar(Turismo turismo) throws OperationNotSupportedException {
		if (turismo == null) {
			throw new NullPointerException("ERROR: No se puede borrar un turismo nulo.");
		}
		if (this.turismo.contains(turismo)) {
			this.turismo.remove(turismo);
		} else {
			throw new OperationNotSupportedException("ERROR: No existe ningún turismo con esa matrícula.");
		}
	}
}
