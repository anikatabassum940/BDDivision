package com.anika.bddivision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    ImageView imgDivision;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgDivision=findViewById(R.id.img_division);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        //data received
        String getId=getIntent().getExtras().getString("id");

        if(getId.equals("1"))
        {
            imgDivision.setImageResource(R.drawable.dhaka);
            txtName.setText("Dhaka");
            txtDescription.setText("Dhaka Division (Bengali: ঢাকা বিভাগ, Ḑhaka Bibhag) is an administrative division within Bangladesh.[2] The capital and largest city is Dhaka. The Division as constituted prior to 2015 covered an area of 31,051 km2,[2] and had a population of 47,424,418 at the 2011 Census. However, following the separation of the new Mymensingh Division in 2015, the area has been reduced to 20,508.8 km2 with a population at the 2011 Census of 36,433,505.");

        }

        if(getId.equals("2"))
        {
            imgDivision.setImageResource(R.drawable.ctg);
            txtName.setText("Chittagong");
            txtDescription.setText("Chittagong Division is geographically the largest of the eight administrative divisions of Bangladesh. It covers the south-easternmost areas of the country, with a total area of 33,771.18 km2 (13,039.13 sq mi)[2] and a population at the 2011 census of 28,423,019. The administrative division includes mainland Chittagong District, neighbouring districts and the Chittagong Hill Tracts. ");

        }
        if(getId.equals("3"))
        {
            imgDivision.setImageResource(R.drawable.khulna);
            txtName.setText("Khulna");
            txtDescription.setText("Khulna Division (Bengali: খুলনা বিভাগ) is one of the eight divisions of Bangladesh. It has an area of 22,285 km2 and a population of 15,563,000 at the 2011 Census (preliminary returns). Its headquarters is Khulna city in Khulna District.The Khulna division borders the North 24 Parganas district and South 24 Parganas district of West Bengal to the west, the Rajshahi Division to the north, the Dhaka division and the Barisal division to the east, and has a coastline on the Bay of Bengal to the south. It is part of the Ganges River delta or Greater Bengal Delta. Other rivers include the Madhumati River, the Bhairab River and the Kopotokkho River. The region also includes several islands in the Bay of Bengal.");

        }
        if(getId.equals("4"))
        {
            imgDivision.setImageResource(R.drawable.rajshahi);
            txtName.setText("Rajshahi");
            txtDescription.setText("Rajshahi Division (Bengali: রাজশাহী বিভাগ) is one of the eight first-level administrative divisions of Bangladesh. It has an area of 18,174.4 square kilometres (7,017.2 sq mi)[2] and a population at the 2011 Census of 18,484,858.[3] Rajshahi Division consists of 8 districts, 70 Upazilas (the next lower administrative tier) and 1,092 Unions (the lowest administrative tier). This division is most valuable division of Bangladesh . It has an excellent rail and road communication infrastructure. The divisional capital of Rajshahi is only six-seven hours road journey away from Dhaka, the capital city. ");

        }

        if(getId.equals("5"))
        {
            imgDivision.setImageResource(R.drawable.barishal);
            txtName.setText("Barishal");
            txtDescription.setText("Barisal Division is one of the eight administrative divisions of Bangladesh. Located in the south-central part of the country, it has an area of 13,644.85 km2 (5,268.31 sq mi), and a population of 8,325,666 at the 2011 Census. It is bounded by Dhaka Division on the north, the Bay of Bengal on the south, Chittagong Division on the east and Khulna Division on the west. The administrative capital, Barisal city, lies in the Padma River delta on an offshoot of the Arial Khan River. Barisal division is criss-crossed by numerous rivers that earned it the nickname 'Dhan-Nodi-Khal, Ei tine Borishal' (rice, river and canal built Barisal). ");

        }

        if(getId.equals("6"))
        {
            imgDivision.setImageResource(R.drawable.sylhet);
            txtName.setText("Sylhet");
            txtDescription.setText(" Sylhet Division (Bengali: সিলেট বিভাগ, Sylheti: ꠍꠤꠟꠐ ꠛꠤꠜꠣꠉ), is the northeastern division of Bangladesh, named after its main city, Sylhet. The colloquial name Sylhet is derived from its original correct form Srihatta but now the term Sylhet is officially recognized name of this division. There are difference of opinions among the scholars regarding the name Srihatta. It is bordered by the Indian states of Meghalaya, Assam and Tripura to the north, east and south, respectively; and by the Bangladeshi divisions of Chittagong to the southwest and Dhaka and Mymensingh to the west. Along with the Indian districts of the Barak Valley, it forms the Greater Sylhet region.  ");

        }

        if(getId.equals("7"))
        {
            imgDivision.setImageResource(R.drawable.rangpur);
            txtName.setText("Rangpur");
            txtDescription.setText(" Rangpur Division (Bengali: রংপুর বিভাগ) is one the Divisions in Bangladesh. It was formed on 25 January 2010,[1] as Bangladesh's 7th division. Before that, it had been the northern eight districts of the Rajshahi Division. The Rangpur division consists of eight districts. There are 58 Upazilas or subdistricts under these eight districts. Rangpur is the northernmost division of Bangladesh and has a population of 15,665,000 at the 2011 Census.  ");

        }

        if(getId.equals("8"))
        {
            imgDivision.setImageResource(R.drawable.mymensingh);
            txtName.setText("Mymensingh");
            txtDescription.setText(" Mymensingh Division (Bengali: ময়মনসিংহ বিভাগ) is one of the eight administrative divisions of Bangladesh. It has an area of 10,485 square kilometres (4,048 sq mi) and a population of 11,370,000 as of the 2011 census. It was created in 2015 from districts previously comprising the northern part of Dhaka Division.  ");

        }
    }
    }

