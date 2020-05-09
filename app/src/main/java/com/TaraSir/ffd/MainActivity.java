package com.TaraSir.ffd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	int[] ichandler = {R.drawable.chandler0,
			R.drawable.chandler1,
			R.drawable.chandler2,
			R.drawable.chandler3,
			R.drawable.chandler4,
			R.drawable.chandler5,
			R.drawable.chandler6,
			R.drawable.chandler7,
			R.drawable.chandler8,
			R.drawable.chandler9,
			R.drawable.chandler10,
			R.drawable.chandler11};
	int[] imonica = {R.drawable.monica0,
			R.drawable.monica1,
			R.drawable.monica2,
			R.drawable.monica3};
	int[] iros = {R.drawable.ross0,
			R.drawable.ross1,
			R.drawable.ross2,
			R.drawable.ross3,
			R.drawable.ross4,
			R.drawable.ross5,
			R.drawable.ross6,
			R.drawable.ross7,
			R.drawable.ross8,
			R.drawable.ross9,
			R.drawable.ross10,
			R.drawable.ross11,
			R.drawable.ross12,
			R.drawable.ross13,
			R.drawable.ross14,
			R.drawable.ross15,
			R.drawable.ross16,
			R.drawable.ross17,
			R.drawable.ross18,
			R.drawable.ross19,
			R.drawable.ross20,
			R.drawable.ross21,
			R.drawable.ross22,
			R.drawable.ross23};
	int[] irachel = {R.drawable.rachel0,
			R.drawable.rachel1,
			R.drawable.rachel2,
			R.drawable.rachel3,
			R.drawable.rachel4};
	int[] ijoey = {R.drawable.joey0,
			R.drawable.joey1,
			R.drawable.joey2,
			R.drawable.joey3,
			R.drawable.joey4,
			R.drawable.joey5,
			R.drawable.joey6,
			R.drawable.joey7,
			R.drawable.joey8,
			R.drawable.joey9,
			R.drawable.joey10,
			R.drawable.joey11};
	int[] iphoebe = {R.drawable.phoebe0,
			R.drawable.phoebe1,
			R.drawable.phoebe2,
			R.drawable.phoebe3,
			R.drawable.phoebe4,
			R.drawable.phoebe5,
			R.drawable.phoebe6,
			R.drawable.phoebe7,
			R.drawable.phoebe8};

	String[] chandler = { "Channy chan",
            "Matthew Perry",
			"Hi, I'm chandler, I make jokes when I'm uncomfortable",
			"I tend to keep talking 'til somebody stops me.",
            "15, Yemen road, Yemen.",
			"I'm not great at advice, Can I interst you in a sarcastic comment?",
            "I wanna quit the gym.",
            "'Miss Chanandler Bong'",
			"I wanted a donut. And now it's five years later, the donut's gone and I'm still Toby.",
            "Wah-pah©",
			"His legs flail about as if independent from his body",
			"He really is a chameleon",
			"I'm a pretty little girl.",
			"Hi Emma. It's the year 2020. Are you still enjoying your nap?",
            "Gum would be a perfection.",
			"You are shooting with 'Althea'?\nNice shooting!",
            "SHUT UP! SHUT UP!! SHUT UP!!!",
            "Well then I guess, I'm going to Yemen.",
			"Bagels and donuts: Round food... for every mood.",
			"Crackers. Because your cheese needs a buddy.",
			"Cheese. It's milk that you chew.",
			"A grape. Because who can get a watermelon in your mouth?",
			"The phone. Bringing you closer to people who have phones.",
			"Pants. Like shorts but longer.",
			"Honey, I'm Old.",
			"I'm gonna get all uncomfortable & probably make some stupid joke."};

	String[] monica = {"Moon",
            "Courteney Cox Arquette",
			"I was breezy",
			"Married a lesbian, Left a man at the altar, Fell in love with a gay ice dancer, Threw a girl's wooden leg in a fire, Lives in a box.",
			"I KNOW!",
			"Michael Flatley Lord of the Dance.",
			"*Can eat Tic-Tacs only in even numbers*",
			"Welcome to the real world, it sucks, you're gonna love it.",
			"Statistical Analysis and Data Reconfiguration",
			"SEVEN!!",
			"Big fat goalie!",
			"Not just clean, but MONICA CLEAN!",
			"Viva Las Gaygas!"};

	String[] ross = {"Real Dr.Dinosaur",
            "David Schwimmer",
			"UNAGI!",
			"We were on a break!",
			"That sandwich was the only good thing going on in my life.",
			"Someone just ate the only good thing in my life!",
			"Take thee Rachel",
			"I hate Chandler. That bastard ruined my life!",
            "Sweetie, this conversation is starting to make me feel a little uncomfortable.",
            "red ross",
			"It was 5:30 in the morning, and you had rambled on for 18 pages. FRONT AND BACK!",
            "You are over me? When were you under me??",
            "It's not something you are, It's something you have.",
            "Pivot! Pivot!! Pivot!!! Pivot!!!!",
			"I'm fine"};

	String[] rachel = {"Daddy's little princess",
            "Jennifer Aniston",
			"I don't want to be a shoe. What if I want to be a purse? Or, a hat?",
            "You fell asleep?",
			"No, I'm not yelling at you. I'm just yelling near you.",
			"Oh, I'm sorry, did my back hurt your knife?",
			"He's a Transpons, Transponster!!",
			"Favourite Movie:\nClaims: Dangerous Liaisons.\nActually: Weekend at Bernie's.",
			"What were you trying to put it in, her purse?",
			"Salmon skin roll",
            "Just so you know it's not that common, It dosen't happen to every guy, And it is a BIG DEAL!",
			"Isn't that just kick-you-in-the-crotch, spit-on-your-neck fantastic?"};

	String[] joey = {"joe",
            "Matt LeBlanc",
			"Ken Adams",
			"I'd hate to have to save your life and kick your ass in the same day.",
			"\"WHOM\"\nWho came onto 'whom'?",
			"Bleu de la bleu, de la blu bla bleu",
            "You,ve been BAMBOOZLED",
			"Inside Good. Outside Bad",
			"Animals dressed as Humans.",
			" Ichiban\nSahiko ",
			"Years ago, When I was backpacking across western Europe",
			"Maurice The Space Cowboy",
			"I'm curvy and I like it.",
            "A paper, a snow, a ghost",
			"A rock, a dog, The Earth.",
			"It's all a moo point. It's like a cow's opinion. It just doesn't matter. It's moo.",
			"Joey dosen't share food",
            "How you doin'?",
            "Custard, Goood! Jam, goood! Meat, goood!!",
			"I was trying to save my sandwich, It was an instinct"};

	String[] phoebe = {"Regina Phalange",
            "Lisa Kudrow",
			"'E' as in 'ello there mate!'",
			"Smelly Caaaaat",
			" Oh, I wish I could, but I don't want to.",
			"So your husband leaves you and burns down the apartment, the world does not stop.",
			"That's short for Phoebe? I thought that's just what we called each other.",
			"je m'appelle claude",
			"Sticky shoes, sticky shoes,\nnext time I'll avoid the pile.",
			"I'm still waiting for my papier-mache' man.",
			"And Rachel and Chandler,\nHa ah ha ah handler!",
			"MY EYES!!!",
			"I knew something had to be wrong, because my fingernails did not grow at all yesterday. ",
            "But they don't know, that we know, they know, we know!",
            "She's your Lobster!",
			"Princess Consuela Banana Hammock"};

	int ic = new Random().nextInt(ichandler.length);
	int im = new Random().nextInt(imonica.length);
	int ig = new Random().nextInt(iros.length);
	int ir = new Random().nextInt(irachel.length);
	int ij = new Random().nextInt(ijoey.length);
	int ip = new Random().nextInt(iphoebe.length);
	int c = new Random().nextInt(chandler.length);
	int m = new Random().nextInt(monica.length);
	int g = new Random().nextInt(ross.length);
	int r = new Random().nextInt(rachel.length);
	int j = new Random().nextInt(joey.length);
	int p = new Random().nextInt(phoebe.length);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ImageView ichan = findViewById(R.id.ichan);
		final ImageView imon = findViewById(R.id.imon);
		final ImageView iross = findViewById(R.id.iross);
		final ImageView irach = findViewById(R.id.irach);
		final ImageView ijoe = findViewById(R.id.ijoe);
		final ImageView ipheebs = findViewById(R.id.ipheebs);

		final Button bchan = findViewById(R.id.bchan);
		final Button bmon = findViewById(R.id.bmon);
		final Button bross = findViewById(R.id.bross);
		final Button brach = findViewById(R.id.brach);
		final Button bjoe = findViewById(R.id.bjoe);
		final Button bpheebs = findViewById(R.id.bpheebs);

		bchan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ichan.setImageResource(ichandler[ic]);
				if (ic==ichandler.length-1)
					ic=0;
				else ic++;
				bchan.setText(chandler[c]);
				if (c==chandler.length-1)
					c=0;
				else c++;
			}
		});
		bmon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				imon.setImageResource(imonica[im]);
				if (im==imonica.length-1)
					im=0;
				else im++;
				bmon.setText(monica[m]);
				if (m==monica.length-1)
					m=0;
				else m++;
			}
		});
		bross.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				iross.setImageResource(iros[ig]);
				if (ig==iros.length-1)
					ig=0;
				else ig++;
				bross.setText(ross[g]);
				if (g==ross.length-1)
					g=0;
				else g++;
			}
		});
		brach.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				irach.setImageResource(irachel[ir]);
				if (ir==irachel.length-1)
					ir=0;
				else ir++;
				brach.setText(rachel[r]);
				if (r==rachel.length-1)
					r=0;
				else r++;
			}
		});
		bjoe.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ijoe.setImageResource(ijoey[ij]);
				if (ij==ijoey.length-1)
					ij=0;
				else ij++;
				bjoe.setText(joey[j]);
				if (j==joey.length-1)
					j=0;
				else j++;
			}
		});
		bpheebs.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ipheebs.setImageResource(iphoebe[ip]);
				if (ip==iphoebe.length-1)
					ip=0;
				else ip++;
				bpheebs.setText(phoebe[p]);
				if (p==phoebe.length-1)
					p=0;
				else p++;
			}
		});

	}
}