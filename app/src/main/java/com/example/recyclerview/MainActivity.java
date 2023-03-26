package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**initialize the recyclerView and an obj of ModelClass and an obj of the adapter class

     *RecyclerView recyclerView;
     *ModelClass modelClassObj;
     * AdapterClass adapterClassObj;
     * **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /**you can add a list manually
      *  List<modelClass> modelClassList=new ArrayList<>();
     * modelClassList.add(new ModelClass(1,1,"new Post","hey this is the first Post"));
      ->pass the vars in constructor in the model class
      *call the setRecyclerMethod and pass the list
      *setRecycler(modelClassList);
**/
    }
    /**
     * create setRecycler Method (List<modelClassName> modelClassListName )
*private void setRecycler(List<modelClassName> modelClassListName) {
     **declare the recyclerView
     *recyclerView = findViewById(R.id._recycler);
     *RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
     * recyclerView.setLayoutManager(layoutManager);
     * declare the adapter and pass the list
     * adapterClassObj =new AdapterClassName(this,modelClassListName);
     * recyclerView.setAdapter(adapterClassObj);
    }
     **/
}