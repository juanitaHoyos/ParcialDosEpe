package parcial_dos_epe.parcialdosepe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Button btnAuno, btnAdos, btnAtres, btnAcuatro, btnAcinco;
    Button btnBuno, btnBdos, btnBtres, btnBcuatro, btnBcinco;
    Button btnCuno, btnCdos, btnCtres, btnCcuatro, btnCcinco;
    Button btnDuno, btnDdos, btnDtres, btnDcuatro, btnDcinco;

    TextView tvAvotos, tvBvotos, tvCvotos, tvDvotos;
    int totalA, valorA,  votosHijos;
    int totalB, valorB,  votosHijosB;
    int totalC, valorC,  votosHijosC;
    float votosAvengers, votosBohemian, votosInreibles;
    FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAuno = findViewById(R.id.btn_Auno);
        btnAdos = findViewById(R.id.btn_Ados);
        btnAtres = findViewById(R.id.btn_Atres);
        btnAcuatro = findViewById(R.id.btn_Acuatro);
        btnAcinco = findViewById(R.id.btn_Acinco);
        tvAvotos = findViewById(R.id.tv_Avotos);
        totalA = 0;
        valorA = 0;
        votosAvengers = 0;
        votosHijos = 0;

        btnBuno = findViewById(R.id.btn_Buno);
        btnBdos = findViewById(R.id.btn_Bdos);
        btnBtres = findViewById(R.id.btn_Btres);
        btnBcuatro = findViewById(R.id.btn_Bcuatro);
        btnBcinco = findViewById(R.id.btn_Bcinco);
        tvBvotos = findViewById(R.id.tv_Bvotos);
        totalB = 0;
        valorB = 0;
        votosBohemian = 0;
        votosHijosB = 0;

        btnCuno = findViewById(R.id.btn_Cuno);
        btnCdos = findViewById(R.id.btn_Cdos);
        btnCtres = findViewById(R.id.btn_Ctres);
        btnCcuatro = findViewById(R.id.btn_Ccuatro);
        btnCcinco = findViewById(R.id.btn_Ccinco);
        tvCvotos = findViewById(R.id.tv_Cvotos);
        totalC = 0;
        valorC = 0;
        votosInreibles = 0;
        votosHijosC = 0;

        db = FirebaseDatabase.getInstance();

        btnAuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("avengers").push().setValue("1");
            }
        });

        btnAdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("avengers").push().setValue("2");
            }
        });

        btnAtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("avengers").push().setValue("3");
            }
        });

        btnAcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("avengers").push().setValue("4");
            }
        });

        btnAcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("avengers").push().setValue("5");
            }
        });

        db.getReference().child("votos").child("avengers")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String votosA = ""+dataSnapshot.getChildrenCount();
                        votosHijos = Integer.parseInt(votosA);
                        //tvAvotos.setText(votosA);



                        for (DataSnapshot dato: dataSnapshot.getChildren()) {

                            //Log.e("Clave", "" + dato.getKey());
                            //Log.e("Valor", "" + dato.getValue());

                            String valor = dato.getValue(String.class);
                            valorA = Integer.parseInt(valor);




                        }
                        totalA += valorA;

                        if ( votosHijos != 0) {
                            votosAvengers = (float)totalA/votosHijos;


                        }

                        tvAvotos.setText(""+votosAvengers);

                        Log.e("TOTAL", "" + totalA);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

        btnBuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("bohemian").push().setValue("1");
            }
        });

        btnBdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("bohemian").push().setValue("2");
            }
        });

        btnBtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("bohemian").push().setValue("3");
            }
        });

        btnBcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("bohemian").push().setValue("4");
            }
        });

        btnBcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("bohemian").push().setValue("5");
            }
        });

        db.getReference().child("votos").child("bohemian")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String votosB = ""+dataSnapshot.getChildrenCount();
                        votosHijosB = Integer.parseInt(votosB);
                        //tvAvotos.setText(votosA);



                        for (DataSnapshot dato: dataSnapshot.getChildren()) {

                            //Log.e("Clave", "" + dato.getKey());
                            //Log.e("Valor", "" + dato.getValue());

                            String valor = dato.getValue(String.class);
                            valorB = Integer.parseInt(valor);




                        }
                        totalB += valorB;

                        if ( votosHijosB != 0) {
                            votosBohemian = (float)totalB/votosHijosB;


                        }

                        tvBvotos.setText(""+votosBohemian);

                        Log.e("TOTAL", "" + totalB);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

        btnCuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("increibles").push().setValue("1");
            }
        });

        btnCdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("increibles").push().setValue("2");
            }
        });

        btnCtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("increibles").push().setValue("3");
            }
        });

        btnCcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("increibles").push().setValue("4");
            }
        });

        btnCcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.getReference().child("votos").child("increibles").push().setValue("5");
            }
        });

        db.getReference().child("votos").child("increibles")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String votosC = ""+dataSnapshot.getChildrenCount();
                        votosHijosC = Integer.parseInt(votosC);
                        //tvAvotos.setText(votosA);



                        for (DataSnapshot dato: dataSnapshot.getChildren()) {

                            //Log.e("Clave", "" + dato.getKey());
                            //Log.e("Valor", "" + dato.getValue());

                            String valor = dato.getValue(String.class);
                            valorC = Integer.parseInt(valor);




                        }
                        totalC += valorC;

                        if ( votosHijosC != 0) {
                            votosInreibles = (float)totalC/votosHijosC;


                        }

                        tvCvotos.setText(""+votosInreibles);

                        Log.e("TOTAL", "" + totalC);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }
}
