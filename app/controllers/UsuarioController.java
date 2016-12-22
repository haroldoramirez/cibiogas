package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import views.html.painel;

public class UsuarioController extends Controller {

    public Result telaLogin() {
        return ok(login.render());
    }

    public Result painel() {
        return ok(painel.render(""));
    }
}
