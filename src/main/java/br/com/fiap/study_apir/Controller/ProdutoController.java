package br.com.fiap.study_apir.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    //dois jeitos de fazer 

    //1 verboso
    @PostMapping("")
    public ResponseEntity<String> create() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto Criado!");
    }
    
    //2 menos verboso
    @GetMapping("/{id}")
    public ResponseEntity<String> findById() {
        return ResponseEntity.ok("banana");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update() {
        return ResponseEntity.ok("Produto Atualizado!");
    }

    @DeleteMapping("")
    public ResponseEntity<String> delete() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Produto Excluido!");
    }

    

}

