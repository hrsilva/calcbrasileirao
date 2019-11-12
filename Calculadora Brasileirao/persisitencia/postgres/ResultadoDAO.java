package postgres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Resultado;

public class ResultadoDAO implements IResultadoDAO{
	private Connection conexao;
	
	public ResultadoDAO(Connection conexao){
		this.conexao = conexao;
	}

	@Override
	public void atualizaResultado(Resultado resultado) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Resultado getResultado(int codigo) {
		Resultado resultado=null;
		PreparedStatement p = null;
		ResultSet result = null;
		
		try {
			p=conexao.prepareStatement("select * from resultado where cdresultado= ?");
			p.setInt(1, codigo);
			result = p.executeQuery();
			
			if (result.next()) {
				resultado= new Resultado();
				resultado.setCodigo(result.getInt("cdresultado"));
				resultado.setPontos(result.getInt("nrpontos"));
				resultado.setGols(result.getInt("nrgols"));
				resultado.setVitorias(result.getInt("nrvitorias"));
				resultado.setEmpates(result.getInt("nrempates"));
				resultado.setDerrotas(result.getInt("nrderrotas"));
				
				
			}
			result.close();
			p.close();
			
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
	
		
		
		return resultado;
	}


	@Override
	public ArrayList<Resultado> getAllResultado() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteAllResultado() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteResultado(int codigo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setResultado(Resultado resultado) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setAllResultado(ArrayList<Resultado> resultado) {
		// TODO Auto-generated method stub
		
	}
	
	
}
