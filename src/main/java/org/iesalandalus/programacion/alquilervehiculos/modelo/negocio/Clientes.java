package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;

public class Clientes {
	List<Cliente> clientes;

	public Clientes() {

		clientes = new ArrayList<>();
	}

	public List<Cliente> get() {

		return clientes;
	}

	public int getCantidad() {
		int cantidadElementos = 0;

		for (Cliente cantidadaElementos : clientes) {
			cantidadElementos++;
		}
		return cantidadElementos;
	}

	public void insertar(Cliente cliente) throws OperationNotSupportedException {

		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede insertar un cliente nulo.");
		}
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
		} else {
			throw new OperationNotSupportedException("ERROR: Ya existe un cliente con ese DNI.");
		}

	}

	public Cliente buscar(Cliente cliente) {
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede buscar un cliente nulo.");
		}
		if (clientes.contains(cliente)) {
			return cliente;
		} else {
			return null;
		}

	}

	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede borrar un cliente nulo.");
		}
		if (clientes.contains(cliente)) {
			clientes.remove(cliente);
		} else {
			throw new OperationNotSupportedException("ERROR: No existe ningún cliente con ese DNI.");
		}
	}

	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede modificar un cliente nulo.");
		}
		if (nombre != null && !nombre.isBlank()) {
			cliente.setNombre(nombre);
		}
		if (telefono != null && !telefono.isBlank()) {
			cliente.setTelefono(telefono);
		}

		if (!clientes.contains(cliente)) {

			throw new OperationNotSupportedException("ERROR: No existe ningún cliente con ese DNI.");
		}

	}
}
