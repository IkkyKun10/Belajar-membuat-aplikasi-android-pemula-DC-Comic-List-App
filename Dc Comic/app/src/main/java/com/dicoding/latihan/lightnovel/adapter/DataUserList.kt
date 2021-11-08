package com.dicoding.latihan.lightnovel.adapter

import com.dicoding.latihan.lightnovel.R
import com.dicoding.latihan.lightnovel.User

object DataUserList {
    private val animeName = arrayOf(
        "Batman",
        "Flash",
        "Harleen",
        "The Joker",
        "Nightwing",
        "Future State: Gotham",
        "Catwoman",
        "Stargirl Spring Break Special",
        "Suicide Squad",
        "Teen Titans Academy"
    )

    private val genreComic = arrayOf(
        "Action, Thriler, Detective, Heroes | 1-31 Chapter",
        "Action, Thriler, Comedy, Heroes | 1-41 Chapter",
        "Action, Thriler, Psychological, Crime, Super Power | 1-35 Chapter",
        "Action, Thriler, Psychological, Crime, Super Power | 1-39 Chapter",
        "Action, Adventure, Comedy, Super Power | 1-29 Chapter",
        "Action, Adventure, Comedy, Super Power | 1-30 Chapter",
        "Action, Thriler, Psychological, Crime, History | 1-31 Chapter",
        "Action, Thriler, Adventure, Super Power | 1-36 Chapter",
        "Action, Thriler, Psychological, Crime, Super Power | 1-38 Chapter",
        "Action, Thriler, Detective, Heroes | 1-40 Chapter",
    )

    private val animeDecription = arrayOf(
        "In the name of his murdered parents, Bruce Wayne wages eternal war on the criminals of Gotham City. He is vengeance. He is the night. He is Batman. One of the most iconic fictional characters in the world, Batman has dedicated his life to an endless crusade, a war on all criminals in the name of his murdered parents, who were taken from him when he was just a child. Since that tragic night, he has trained his body and mind to near physical perfection to be a self-made Super Hero. He's developed an arsenal of technology that would put most armies to shame. And he's assembled teams of his fellow DC Super Heroes, like the Justice League, the Outsiders and Batman, Incorporated.A playboy billionaire by day, Bruce Wayne’s double life affords him the comfort of a life without financial worry, a loyal butler-turned-guardian and the perfect base of operations in the ancient network of caves beneath his family’s sprawling estate. By night, however, he sheds all pretense, dons his iconic scalloped cape and pointed cowl and takes to the shadowy streets, skies and rooftops of Gotham City.",
        "Three men have held the title of \"The Fastest Man Alive\"—Jay Garrick, Barry Allen and Wally West. Each of them redefined the word \"hero.\"\n" +
                "The mysterious power known as the Speed Force is an energy field that has, over the centuries, granted incredible powers of velocity to certain heroes. The most famous of these is the Flash, also known as the Fastest Man Alive. Ever since the days of World War II, there has been a man clad in red who can run at impossible speeds, using his power to save lives and defend those who cannot defend themselves. All between the ticks of a second.\n" +
                "In the 1940s, college student Jay Garrick acquired his super-speed abilities in a random lab accident and became the first DC Super Hero to go by the name the Flash. Years later, Jay was succeeded by police scientist Barry Allen, until Barry’s former kid partner Wally West took up the mantle at a time when Barry was considered dead. But, when Barry returned, he became the Flash once again. All three generations of speedsters have been cornerstone members of both the Justice Society and Justice League.\n" +
                "The Flash has mastery over not just speed, but time itself, and he has often used his powers to travel though different eras and even into other dimensions. Although the Flash has not always been fast enough to outrun personal tragedy when it has come for him, he always does his best to prevent the same from happening to the people of Central City and Keystone City. In so doing, he's earned himself a spot among the greatest Super Heroes the DC Universe has ever known.",
        "Dr. Harleen Quinzel has discovered a revolutionary cure for the madness of Gotham City-she just needs to prove it actually works. But with the criminal justice and mental health establishments united against her, the brilliant young psychologist must take drastic measures to save Gotham from itself. Witness Harleen’s first steps on a doomed quest that will give birth to the legendary \n" +
                "super-villain Harley Quinn in this stunning reimagining of Harley and The Joker’s twisted and tragic love affair by visionary storyteller Stjepan Sejic (AQUAMAN: UNDERWORLD, SUICIDE SQUAD, Sunstone).",
        "The hunt for The Joker is under way, as Jim Gordon heads to a remote part of South America to run down a lead...and comes face-to-face with the Clown Prince of Crime himself! The mystery around A-Day deepens, but not before an attack by the blood-thirsty Sampson family! And in the Punchline backup story, Punchline has to face off against the Queen of Spades’ new muscle...Orca! At the same time,\n" +
                "Bluebird’s investigation at Punchline’s alma mater takes a dark and horrifying turn!",
        "Benjamin Percy’s run on NIGHTWING begins here! Change is on the horizon for Dick Grayson. A new technologist sets his sights on Blüdhaven, creating a holographic, interconnected city where everyone is an individual and part of a larger network.\n" +
                "It’s the Internet made physical. Gentrification on gigabyte-laced steroids. But when this new utopia encroaches on his turf, Nightwing starts to uncover a sinister plot based not on revenge...but on a reckoning. Collects NIGHTWING #44-48 and ANNUAL #1.",
        "The event that was DC Future State continues in its own ongoing title starring the Bat-Family, beginning with the epic story “Hunt the Batman.” Disaster strikes Gotham City, and all evidence points to the Next Batman! Red Hood must choose justice over his family and allies when the corrupt Magistrate enlists him to bring in the new Batman dead or alive! Featuring the entire cast from the popular Future State Batman titles, this new series kicks off the next chapter in this forbidding world of tomorrow, and does so in brilliant, monochromatic storytelling!\n" +
                "This black-and-white series will showcase the brutal world that’s around the corner in Future State Gotham!",
        "Catwoman and Shoes have crashed Mr. Roy’s home art gallery opening, but they aren’t there to nick a Klimt or a Monet. No, they’re after the newest addition to Mr. Roy’s esteemed collection: a large test tube containing Poison Ivy! But how did Pamela get in this predicament in the first place, what was done to her, and why does she seem...different?",
        "Legendary comics writer Geoff Johns returns to his breakthrough hero, Stargirl, in this special one-shot illustrated by Todd Nauck! Courtney Whitmore’s spring break plans aren’t like your average high schooler’s. Instead of hanging out with friends, she’s heading out on an adventure with her stepfather, Pat Dugan, a.k.a. S.T.R.I.P.E., and teaming up with his former team,\n" +
                "the Seven Soldiers of Victory! The Soldiers are forced to reunite again to unearth the secret eighth Soldier of Victory, but what other secrets lie buried, and what does it all mean for Courtney’s future as Stargirl?",
        "Don’t miss this crossover with Teen Titans Academy! Task Force X finds a new target, and it leads the clandestine team right to Teen Titans Academy. The devious and driven Amanda Waller continues her quest to form a more powerful Squad, and next on her list: the Titans’ new speedster, Bolt. But when the mysterious Red X gets in the way, he becomes Waller’s next target.",
        "Don’t miss this crossover with Suicide Squad! Hunted by the deadly Task Force X, the new students of Titans Academy will have to grow up fast or risk losing one of their own even faster. Why has the Squad put a target on new speedster Bolt’s back? And why, in its charge on Titans Island, is Amanda Waller’s team of villains being led by the mysterious Red X?!"
    )

    private val animeAvatar = arrayOf(
        R.drawable.dc_comics_batman,
        R.drawable.dc_comics_flash,
        R.drawable.dc_comics_harleen,
        R.drawable.dc_comics_the_joker,
        R.drawable.dc_comics_nightwing,
        R.drawable.dc_comics_future_state,
        R.drawable.dc_comics_catwoman,
        R.drawable.dc_comics_starlight,
        R.drawable.dc_comics_suicide,
        R.drawable.dc_comics_teen_titans
    )



    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in animeName.indices){
                val action = User()
                action.name = animeName[position]
                action.avatar = animeAvatar[position]
                action.description = animeDecription[position]
                action.genreComic = genreComic[position]
                list.add(action)
            }
            return list
        }
}