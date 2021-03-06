package fr.wcs.monsterwiki;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.action_setting);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final ListView listTrip = findViewById(R.id.list_monster);
        ArrayList<MonsterModel> monsterList = new ArrayList<>();


        monsterList.add(new MonsterModel("Tyrannoking", R.drawable.darktyrannoking_1, R.drawable.bte_dark));
        monsterList.add(new MonsterModel("Fire Lion", R.drawable.fire_lion_1fire, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Panda", R.drawable.naturepanda_1, R.drawable.bte_nature));
        monsterList.add(new MonsterModel("Rockila", R.drawable.earthrockilla_1, R.drawable.bte_earth));
        monsterList.add(new MonsterModel("Thunder Eagle", R.drawable.thunderthunder_eagle_1, R.drawable.bte_thunder));
        monsterList.add(new MonsterModel("Sealion", R.drawable.watersealion_1, R.drawable.bte_water, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Djinn", R.drawable.magicdjinn_1, R.drawable.bte_magic, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Scorchpeg", R.drawable.lightscorchpeg_1, R.drawable.bte_light, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Vadamagma", R.drawable.legendvadamagma_1, R.drawable.bte_legend, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Gravoid", R.drawable.metalgravoid_1, R.drawable.bte_metal, R.drawable.bte_earth));

        ArrayList<MonsterModel> monsterListFiltered = new ArrayList<>();
        Intent intent = getIntent();
        String items = intent.getStringExtra("element");
        if(items==null){
            items="";
            monsterListFiltered = monsterList;
        }

        if (items.equals("dark")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_dark || monsterModel.getElement2() == R.drawable.bte_dark) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        //creation de la boucle
        if (items.equals("fire")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_fire || monsterModel.getElement2() == R.drawable.bte_fire) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("earth")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_earth || monsterModel.getElement2() == R.drawable.bte_earth) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("light")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_light || monsterModel.getElement2() == R.drawable.bte_light) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("water")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_water || monsterModel.getElement2() == R.drawable.bte_water) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("thunder")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_thunder || monsterModel.getElement2() == R.drawable.bte_thunder) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("magic")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_magic || monsterModel.getElement2() == R.drawable.bte_magic) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("nature")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_nature || monsterModel.getElement2() == R.drawable.bte_nature) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("legend")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_legend || monsterModel.getElement2() == R.drawable.bte_legend) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }
        if (items.equals("metal")) {
            //creer nouvelle liste =liste finale
            for (MonsterModel monsterModel : monsterList) {
                //si l'element *** correspond à***
                if (monsterModel.getElement1() == R.drawable.bte_metal || monsterModel.getElement2() == R.drawable.bte_metal) {
                    //on le rajoute a la nouvelle liste
                    monsterListFiltered.add(monsterModel);
                }
            }
        }




        // récupérer la valeur de l'extra Type


        // créer un nouvel ArrayList vide

        // faire une boucle qui parcours tous les éléments de results

        // si l'élément à le même type que celui de l'intent, l'ajouter à la nouvelle ArrayList

        // charger l'adapter avec la nouvelle ArrayList plutôt que results


      /*  results.add(new MonsterModel("ugrehhd",14,65,2));
        results.add(new MonsterModel("ugeghd",1,8,2));*/


        //ancien code MonsterAdapter adapter = new MonsterAdapter(this, results);
        //on envoit la nouvelle liste a afficher
        final MonsterAdapter adapter = new MonsterAdapter(this, monsterListFiltered);
        listTrip.setAdapter(adapter);

        final ListView listv = findViewById(R.id.list_monster);
        final ArrayList<MonsterModel> finalMonsterListFiltered = monsterListFiltered;
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MainActivity.this, MonsterActivity.class);

                MonsterModel currentMonster = finalMonsterListFiltered.get(i);
                intent.putExtra("extraname", currentMonster.getName());


                startActivity(intent);
            }
        });


    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_setting) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        String element;

        if (id == R.id.nav_dark) {
           element="dark";
           intent.putExtra("element",element);
            // Handle the camera action
        } else if (id == R.id.nav_fire) {
            element="fire";
            intent.putExtra("element",element);

        } else if (id == R.id.nav_earth) {
            element="earth";
            intent.putExtra("element",element);

        } else if (id == R.id.nav_light) {
            element="light";
            intent.putExtra("element",element);

        } else if (id == R.id.nav_water) {
            element="water";
            intent.putExtra("element",element);
        } else if (id == R.id.nav_thunder) {
            element="thunder";
            intent.putExtra("element",element);
        } else if (id == R.id.nav_magic) {
            element="magic";
            intent.putExtra("element",element);

        } else if (id == R.id.nav_nature) {
            element="nature";
            intent.putExtra("element",element);
        } else if (id == R.id.nav_legend) {
            element="legend";
            intent.putExtra("element",element);
        }else if (id == R.id.nav_metal) {
            element="metal";
            intent.putExtra("element",element);
        }

        startActivity(intent);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);



        // [...]
        return true;
    }

}


