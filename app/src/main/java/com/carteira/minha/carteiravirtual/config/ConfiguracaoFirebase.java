package com.carteira.minha.carteiravirtual.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {
    private static FirebaseAuth autentificacao;

    //retorna a instancia do firebase
    public static FirebaseAuth getFirebaseAutentificacao() {
        if (autentificacao == null){
            autentificacao = FirebaseAuth.getInstance();
        }

        return autentificacao;

    }
}
