package com.rabbi.drawernav;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      //return super.onCreateView(inflater, container, savedInstanceState);
      return inflater.inflate(R.layout.one_fragment,container,false);
   }
    
    
    
}
