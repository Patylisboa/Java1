package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Usuario;
import br.com.javaweb.gerenciador.dao.UsuarioDAO;
@WebServlet("/login")
public class Login extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new UsuarioDAO().
		buscaPorEmailESenha(email, senha);
		
		if (usuario == null) {
			resp.sendRedirect("/ExemploServlets/erro.html");
		} else{
				Cookie cookie = new Cookie("usuario.logado", email);
				resp.addCookie(cookie);
				resp.sendRedirect("/ExemploServlets/index.html");
			}
		}
	}
	
	 

