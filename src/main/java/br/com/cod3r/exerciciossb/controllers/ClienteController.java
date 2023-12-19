package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

  @GetMapping(path = "/qualquer")
  public Cliente obterCliente() {
    return new Cliente(28, "Pedro", "111.222.333-44");
  }

  @GetMapping("/{id}")
  public Cliente obterClientePorId1(@PathVariable int id) {
    return new Cliente(id, "Maria", "222.111.333.44");
  }

  @GetMapping
  public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
    return new Cliente(id, "Joao Augusto", "888.333.555-33");
  }
}
