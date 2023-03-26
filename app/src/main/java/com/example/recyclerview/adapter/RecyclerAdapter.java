package com.example.recyclerview.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

 class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
//Arraylist of model class List<ModelClass> modelClassList;, and context and constructor containing them
     @NonNull
     @Override
     public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         //inflate the layout(_item) and return the view
/**
 *  View view= LayoutInflater.from(parent.getContext())
 *                 .inflate(R.layout.layout_item,parent,false);
 *                return new RecyclerViewHolder(view);
 */
         return null;
     }



     public class RecyclerViewHolder extends RecyclerView.ViewHolder {
         //Declare the view in the layout_item
         //TextView userIdTv;
         public RecyclerViewHolder(@NonNull View itemView) {
             super(itemView);
             //initialize the views=itemview.findviewbyid
            // userIdTv=itemView.findViewById(R.id.user_id_tv);

         }
     }
     @Override
     public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerViewHolder holder, int position) {
         /**holder.view.setText - , set the views
         *holder.imageView.setImageResource(productsList.get(position).getImageUrl());
          * ModelClass obj=(ModelClass) ModelClassList.get(position);
          holder.textview.setText(Integer.toString(obj.getId()));//getId from the getter method in PostModel class
         **/
         /** you can add on Click Listener
          *  holder.itemView.setOnClickListener(new View.OnClickListener() {
          *             @Override
          *             public void onClick(View v) {
          *                 //launch the item detail intent
          *                 Intent intentObj=new Intent(context, ItemIntent.class);
          *             //add the transimision animation here
          *                 Pair[] pairs=new Pair[1];
          *                 //prodimage that is the image that has an attribute transimisionName:image
          *                 pairs[0]=new Pair<View, String>(holder.prodImage,"image");
          *                 ActivityOptions activityOptions= ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
          *                 context.startActivity(intentObj, activityOptions.toBundle());
          *             }
          *         });
          */
     }


     @Override
     public int getItemCount() {
         //return modelClassList.size();
         return 0;
     }
 }
