package br.com.sienge.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sienge.domain.api.ApiTransporte;
import br.com.sienge.domain.entity.Transporte;
import br.com.sienge.service.imp.TransporteService;

@RestController
@RequestMapping("/api/transporte")
public class TransporteController {

	 @Autowired
	    private TransporteService tService;
		
		@CrossOrigin(origins = "*")
	    @RequestMapping(value={"/custo","/custo/"}, method=RequestMethod.POST,  
	    		consumes="application/json", produces="text/plain")    
	    public ResponseEntity<?> getCustoTransporte(@RequestBody ApiTransporte api){        
	        try{
				Transporte transporte = new Transporte(dto);
				String retorno= this.tService.getCustoStr(transporte);
				return new ResponseEntity<>(retorno, HttpStatus.OK);		
			} catch(IllegalArgumentException e){
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
			} catch(CalculoException e){
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			} catch(Exception e){
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
	    }
	
}
