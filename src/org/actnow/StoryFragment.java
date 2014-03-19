package org.actnow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class StoryFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup rootView = (ViewGroup) inflater.inflate(
				R.layout.fragment_documentary, container, false);
		initializeView(rootView);
		return rootView;
	}

	private void initializeView(ViewGroup rootView) {
		Button signPettition = (Button) rootView.findViewById(R.id.btnDocSign);
		signPettition.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Starting activity for signPetition");
				startActivity(new Intent(getActivity().getApplicationContext(),
						PetitionActivity.class));
			}
		});
		ImageView playButton = (ImageView) rootView.findViewById(R.id.wallPaper);
		playButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri
						.parse("http://www.youtube.com/watch?v=LRTTPs-AujA")));
			}
		});
	}
}
