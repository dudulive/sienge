package br.com.sienge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sienge.domain.api.ApiTransporte;
import br.com.sienge.domain.api.conversor.TransporteConversor;
import br.com.sienge.domain.entity.Transporte;
import br.com.sienge.service.ITransporteService;

@RestController
@RequestMapping("/api/transporte")
public class TransporteController {

	@Autowired
	private ITransporteService service;
	@Autowired
	private TransporteConversor conversor;

	@CrossOrigin(origins = "*")
	@RequestMapping(value = { "/custo",
			"/custo/" }, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getCustoTransporte(@RequestBody ApiTransporte api) {
		try {
			Transporte transporte = conversor.deApiParaEntidade(api);
			transporte.setCustoTransporte(service.getCusto(transporte));
			return new ResponseEntity<>(transporte, HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
