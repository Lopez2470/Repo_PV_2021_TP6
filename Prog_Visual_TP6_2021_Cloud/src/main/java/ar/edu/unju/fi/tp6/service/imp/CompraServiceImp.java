package ar.edu.unju.fi.tp6.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.model.Compra;
import ar.edu.unju.fi.tp6.service.ICompraService;
import ar.edu.unju.fi.tp6.util.TablaCompra;

@Service
public class CompraServiceImp implements ICompraService {
	
	List<Compra> compras = TablaCompra.listaCompras;
	

	@Override
	public void generarTablaCompra() {
	}
	

	@Override
	public void guardarCompra(Compra compra) {
		if (compras==null) {
			generarTablaCompra();
		}
		compras.add(compra);

	}

	@Override
	public List<Compra> obtenerCompras() {
		return compras;
	}

}
