package br.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Veiculo;
import br.com.model.VeiculoDAO;



/**
 * Servlet implementation class ServletTrabalhoFinal
 */
@WebServlet("/ServletTrabalhoFinal")
public class ServletTrabalhoFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private VeiculoDAO veiculoD;
	VeiculoDAO veiculoD = new VeiculoDAO();
	
//		veiculoD = new VeiculoDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTrabalhoFinal() {
        super();
//        veiculoD = new VeiculoDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String option = request.getParameter("option");
		if (option == null) {
			option = "qualquer coisa";
		}
		switch(option) {
		
			case ("form"):
			form(request,response);
			
			break;
			case ("editar"):
				editar(request,response);
			break;
			
			
			
			case ("deletar"):
				removerCarro(request,response);
			break;
			
			case ("atualizar"):
				atualizarCarro(request,response);
			break;
			case ("salvar"):
				adicionarCarro(request,response);
			break;
			
			
			
			default:
				formularioCadastro(request, response);
	}
		

}
	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		Veiculo v = this.veiculoD.buscarVeiculo(id);
		request.setAttribute("auto", v);
		request.getRequestDispatcher("formulario.jsp").forward(request, response);
	}
	
	private void adicionarCarro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String placa = request.getParameter("placa");
		String modelo = request.getParameter("modelo");
		String marca = request.getParameter("marca");
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		if((placa != null ) && (modelo != null) && (marca != null)) {
			Veiculo v = new Veiculo(placa, modelo, marca, ano);
			veiculoD.addVeiculo(v);
		
		}
		response.sendRedirect("ServletTrabalhoFinal");		
	}
	private void form(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formulario.jsp").forward(request, response);
	}
	private void removerCarro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String idBack = request.getParameter("id");
			if (idBack != null) {
				Integer id = Integer.parseInt(idBack);
				veiculoD.removeVeiculo(id);
				
			}
		response.sendRedirect("ServletTrabalhoFinal");	
	}
	
	private void atualizarCarro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		String placa = request.getParameter("placa");
		String modelo = request.getParameter("modelo");
		String marca = request.getParameter("marca");
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		
		
		
		if((placa != null ) && (modelo != null) && (marca != null)) {
			Veiculo v = new Veiculo(placa, modelo, marca, ano);
			v.setId(id);
			this.veiculoD.updateVeiculo(v);
		}
		response.sendRedirect("ServletTrabalhoFinal");
	}
	
	private void formularioCadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listagemVeiculo",veiculoD.getListVeiculo() );
		request.getRequestDispatcher("/").forward(request, response);
	}
}
	
	

		
		
		
		
		
		
		
		
		
		
		
