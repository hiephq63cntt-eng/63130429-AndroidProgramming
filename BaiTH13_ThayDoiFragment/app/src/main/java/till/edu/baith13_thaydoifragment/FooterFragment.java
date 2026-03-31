package till.edu.baith13_thaydoifragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FooterFragment extends Fragment {

    public FooterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        Button b1 = v.findViewById(R.id.button1);
        Button b2 = v.findViewById(R.id.button2);
        Button b3 = v.findViewById(R.id.button3);

        FragmentManager fragmentManager = getParentFragmentManager();

        b1.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment1())
                    .commit();
        });

        b2.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment2())
                    .commit();
        });

        b3.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment3())
                    .commit();
        });

        return v;
    }
}