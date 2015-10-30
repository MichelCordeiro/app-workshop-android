package br.ceuma.primeiroapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends Activity {

	private TextView nome;
	private TextView email;
	private TextView senha;
	private Button btn;
	private User usuarioBR;
	private Context context = this;
	
	private EditText txtNome;
	private EditText txtEmail;
	private EditText txtSenha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		
		txtNome = (EditText) findViewById(R.id.editText1);
		txtEmail = (EditText) findViewById(R.id.editText2);
		txtSenha = (EditText) findViewById(R.id.editText3);
		
		btn= (Button) findViewById(R.id.button1);
	
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				usuarioBR = new User();
				
				usuarioBR.setEmail(txtEmail.getText().toString());
				usuarioBR.setNome(txtNome.getText().toString());
				usuarioBR.setSenha(txtSenha.getText().toString());
				
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
