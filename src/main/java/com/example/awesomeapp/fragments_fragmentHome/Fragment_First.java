package com.example.awesomeapp.fragments_fragmentHome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.awesomeapp.R;

/**
 * Created by minetea on 2017/10/5.
 */

public class Fragment_First extends Fragment
	{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
		
		View view = inflater.inflate(R.layout.fragment_first_homefragment,container,false);
		return view;
		}
	
	}
