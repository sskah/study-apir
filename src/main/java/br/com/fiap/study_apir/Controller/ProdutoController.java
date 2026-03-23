package br.com.fiap.study_apir.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping("")
    public String create() {
        return "Produto Criado!";
    }

    @GetMapping("/{id}")
    public String findById() {
        return "Banana";
    }

    @PutMapping("/{id}")
    public String update() {
        return "Produto Atualizado!";
    }

    @DeleteMapping("")
    public String delete() {
        return "Produto Excluido!";
    }

    

}

