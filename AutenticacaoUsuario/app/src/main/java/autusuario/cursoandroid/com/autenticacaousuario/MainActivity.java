package autusuario.cursoandroid.com.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();





        //LOGIN USUARIO
        /*
        firebaseAuth.signInWithEmailAndPassword("email@gmail.com", "123456").addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    Log.i("signIn", "Sucesso ao fazer login do usuario!");
                }else {
                    Log.i("signIn", "Erro ao fazer login do usuario!");
                }

            }
        });
        */

        firebaseAuth.signOut();

        //VERIFICA USUARIO LOGADO
        if(firebaseAuth.getCurrentUser() != null){
            Log.i("verificaUser", "Está logado!");

        }else {
            Log.i("verificaUser", "Não está logado!");
        }


        //CADASTRO
        /*
        firebaseAuth.createUserWithEmailAndPassword("email@gmail.com", "123456").addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    Log.i("createUser", "Sucesso!");
                }else {
                    Log.i("createUser", "Erro!");
                }

            }
        });
        */
    }
}
