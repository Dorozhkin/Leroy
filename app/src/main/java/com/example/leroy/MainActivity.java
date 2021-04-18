package com.example.leroy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.leroy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] forThreeRecycles = new String[7];
        forThreeRecycles[0] = "cover%Ковровое покрытие «Coco 34», 4 м, цвет коричневый%1 100₽/м²";
        forThreeRecycles[1] = "kashpo%Кашпо Idea Дюна ø34 h63 см v42 л пластик кремовый%658₽/шт.";
        forThreeRecycles[2] = "oboi%Обои флизелиновые Rasch Emanuelle Rivassoux 0.53 м 937206%1 338₽/шт.";
        forThreeRecycles[3] = "pena%Пена монтажная Axton ручная, 750 мл%284₽/шт.";
        forThreeRecycles[4] = "perforator%Перфоратор SDS-plus Makita HR2470, 780 Вт, 2.7 Дж%7 788₽/шт.";
        forThreeRecycles[5] = "salfetka%Салфетка, 35x35 см, микрофибра, 4 шт.%122₽/шт.";
        forThreeRecycles[6] = "stekol%Средство для мытья стёкол Prosept 0.5 л%116₽/шт.";

        String[] forCategories = new String[7];
        forCategories[0] = "menu%Каталог";
        forCategories[1] = "plantcategory%Сад";
        forCategories[2] = "lampcategory%Освещение";
        forCategories[3] = "drillcategory%Инструменты";
        forCategories[4] = "brickcategory%Строймате- риалы";
        forCategories[5] = "curtaincategory%Декор";
        forCategories[6] = ">%Смотреть всё";


        CategoriesAdapter adapter1 = new CategoriesAdapter();
        AdapterForThreeRecycles adapter2 = new AdapterForThreeRecycles();
        AdapterForThreeRecycles adapter3 = new AdapterForThreeRecycles();
        AdapterForThreeRecycles adapter4 = new AdapterForThreeRecycles();
        adapter1.setData(forCategories);
        adapter1.setResources(getResources());
        adapter2.setData(forThreeRecycles);
        adapter3.setData(forThreeRecycles);
        adapter4.setData(forThreeRecycles);

        LinearLayoutManager llm1 = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager llm2 = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager llm3 = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager llm4 = new LinearLayoutManager(getApplicationContext());
        llm1.setOrientation(RecyclerView.HORIZONTAL);
        llm2.setOrientation(RecyclerView.HORIZONTAL);
        llm3.setOrientation(RecyclerView.HORIZONTAL);
        llm4.setOrientation(RecyclerView.HORIZONTAL);

        binding.recycler1.setLayoutManager(llm1);
        binding.recycler2.setLayoutManager(llm2);
        binding.recycler3.setLayoutManager(llm3);
        binding.recycler4.setLayoutManager(llm4);

        binding.recycler1.setAdapter(adapter1);
        binding.recycler2.setAdapter(adapter2);
        binding.recycler3.setAdapter(adapter3);
        binding.recycler4.setAdapter(adapter4);


        binding.motion.addTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {
            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {
            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                switch (i) {
                    case R.id.start:
                        w.setStatusBarColor(getResources().getColor(R.color.leroy));
                        motionLayout.setBackgroundColor(getResources().getColor(R.color.leroy));
                        break;
                    case R.id.end:
                        w.setStatusBarColor(Color.WHITE);
                        motionLayout.setBackgroundColor(Color.WHITE);
                        break;
                }
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });
    }
}