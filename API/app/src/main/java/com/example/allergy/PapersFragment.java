package com.example.allergy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PapersFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PapersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PapersFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TextView paper1;
    TextView paper2;
    TextView paper3;
    TextView paper4;

    boolean openPaper1;
    boolean openPaper2;
    boolean openPaper3;
    boolean openPaper4;



    private OnFragmentInteractionListener mListener;

    public PapersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PapersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PapersFragment newInstance(String param1, String param2) {
        PapersFragment fragment = new PapersFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_papers, container, false);

        paper1 = view.findViewById(R.id.paper1);
        paper2 = view.findViewById(R.id.paper2);
        paper3 = view.findViewById(R.id.paper3);
        paper4 = view.findViewById(R.id.paper4);

        changePaper();


        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void changePaper(){

        paper1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (openPaper1)
                        {
                            openPaper1 = false;
                            paper1.setText("Полезно знать о пыльцевой аллергии");
                        }
                        else
                        {
                            openPaper1 = true;
                            paper1.setText("В статье представлена общая информация о том, что такое пыльцевая аллергия. Данное заболевание является весьма распространенным, им страдают порядка 20% населения, в основном это люди в возрасте от 5 до 40 лет. Большое количество пыльцы в воздухе наблюдается весной (как правило пыльца деревьев) и летом (пыльца других трав). Основными симптомами аллергической реакции являются - насморк, зуд в носу, слезотечение, приступы чихания. Главным в лечении аллергии на пыльцу является устранение контакта с аллергеном, также существует ряд медикаментов, способных помочь купировать приступ. Основными советами пыльцевым аллергикам будут: в соответствии с предписанием врача вовремя принимать антигистаминный препараты, проводить регулярную влажную уборку, стараться не проветривать помещение в периоды большей концентрации пыльцы в воздухе (с утра до раннего вечера). \n" +
                                    "Для более подробно информации переходите по ссылке.\n Источник: https://www.naaf.no/ru/fokusomrader/allergi-og-overfolsomhet/pollenallergi/-----pollenallergi/");

                        }
                    }
                }
        );

        paper2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (openPaper2)
                        {
                            openPaper2 = false;
                            paper2.setText("Сезонная аллергия: есть ли спасение?");
                        }
                        else
                        {
                            openPaper2 = true;
                            paper2.setText("Поллиноз или или сезонный аллергический риноконъюнктивит - достаточно серьезное заболевание, причина которого аллергическая реакция на пыльцу. Факторами риска в данном случае выступают: плохая экология, наличие заболевания таких как бронхиальная астма, слабый иммунитет. Одним из эффективных методов лечения является - иммунотерапия аллергенами (инъекция аллергенов), данный метод позволяет достичь ремиссии заболевания практически у 80% пациентов. Другим методом уменьшения проявления сезонной аллергии выступает прем медикаментов или использование барьерных средств (фильтры для носа, респираторы-невидимки). \n" +
                                    "Для более подробно информации переходите по ссылке.\n Источник: https://doc-tv.ru/articles/355");

                        }
                    }
                }
        );

        paper3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (openPaper3)
                        {
                            openPaper3 = false;
                            paper3.setText("Как пережить весну: 20 полезных советов при аллергии");
                        }
                        else
                        {
                            openPaper3 = true;
                            paper3.setText("Статья начинается с краткого введения о том, что такое пыльцевая аллергия. Далее \"развенчиваются\" восемь широко распространённых мифов об аллергии: в частности, о том, что аллергия не может появиться в зрелом возрасте, не требует особого лечения, а поход к аллергологу обходится очень дорого. Основной посыл статьи - о необходимости своевременно обращаться к врачу-специалисту, а не увлекаться самолечением. Также даётся 20 базовых советов по профилактике поллиноза: закрывать окна в машине и дома на ночь, промывать нос физ. раствором, избегать переутомления и т.д. Завершается статья краткими сведениями о перекрёстной аллергии - когда из-за пыльцевых аллергенов развивается реакция на пищевые продукты..\n Источник: https://the-challenger.ru/eda/retsepty/10-poleznyh-desertov-kotorye-ochen-prosto-gotovit/");

                        }
                    }
                }
        );

        paper4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (openPaper4)
                        {
                            openPaper4 = false;
                            paper4.setText("Радикальное лечение аллергии: аллергенспецифическая иммунотерапия (АСИТ)");
                        }
                        else
                        {
                            openPaper4 = true;
                            paper4.setText("Данная статья посвящена аллерген-специфической иммунотерапии (АСИТ) как самому на сегодняшний момент эффективному методу лечения пыльцевой аллергии. Даётся информация по желательным срокам проведения АСИТ, принципу работы АСИТ. Описываются фазы проведения АСИТ, возможные побочные эффекты и противопоказания. Даются не только рекомендации к проведению процедуры, но и предупреждения о возможных последствиях.\n Источник: https://habr.com/ru/company/tion/blog/399447/");

                        }
                    }
                }
        );


    }



}
