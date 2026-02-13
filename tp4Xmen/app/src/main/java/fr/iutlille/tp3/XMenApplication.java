package fr.iutlille.tp3;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.util.ArrayList;
import java.util.List;

public class XMenApplication extends Application {
    // variable globale de l\'application : la liste des XMen
    private final List<XMen> liste = new ArrayList<>();

    // initialisation du contexte
    @Override public void onCreate(){
        super.onCreate();

        Resources res = getResources();
        final String[] noms = res.getStringArray(R.array.noms);
        final String[] alias = res.getStringArray(R.array.alias);
        final String[] confreries = res.getStringArray(R.array.confrerie);
        final String[] descriptions = res.getStringArray(R.array.descriptions);
        final String[] pouvoirs = res.getStringArray(R.array.pouvoirs);
        TypedArray images = res.obtainTypedArray(R.array.idimages);


        for(int i = 0; i < noms.length; i++) {
            liste.add(new XMen(noms[i], alias[i], confreries[i], descriptions[i], pouvoirs[i], images.getResourceId(i, 0)));
        }

        images.recycle();
     }

    public List<XMen> getListe() {
        return liste;
    }
}
