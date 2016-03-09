package net.dvt32.motivateme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] quotes = new String[] {
            // "\"" + "quote" + "\"" + "<br />" + "author",
            "\"" + "I only write when inspiration strikes. Fortunately it strikes at nine every morning." + "\"" + "<br />" + "- William Faulkner",
            "\"" + "Life is 10% what happens to us and 90% how we react to it." + "\"" + "<br />" + "- Dennis P. Kimbro",
            "\"" + "An unexamined life is not worth living." + "\"" + "<br />" + "– Socrates",
            "\"" + "Eighty percent of success is showing up." + "\"" + "<br />" + "– Woody Allen",
            "\"" + "The best revenge is massive success." + "\"" + "<br />" + "- Frank Sinatra",
            "\"" + "If you want to lift yourself up, lift up someone else." + "\"" + "<br />" + "– Booker T. Washington",
            "\"" + "A person who never made a mistake never tried anything new." + "\"" + "<br />" + "- Albert Einstein",
            "\"" + "You become what you believe." + "\"" + "<br />" + "– Oprah Winfrey",
            "\"" + "I would rather die of passion than of boredom." + "\"" + "<br />" + "– Vincent van Gogh",
            "\"" + "It does not matter how slowly you go as long as you do not stop." + "\"" + "<br />" + "– Confucius",
            "\"" + "Do what you can, where you are, with what you have." + "\"" + "<br />" + "– Teddy Roosevelt",
            "\"" + "The question isn’t who is going to let me; it’s who is going to stop me." + "\"" + "<br />" + "- Ayn Rand",
            "\"" + "The only way to do great work is to love what you do." + "\"" + "<br />" + "– Steve Jobs",
            "\"" + "If you're going through hell keep going." + "\"" + "<br />" + "- Winston Churchill",
            "\"" + "Success is the sum of small efforts, repeated day-in and day-out." + "\"" + "<br />" + "- Robert Collier",
            "\"" + "Motivation is what gets you started. Habit is what keeps you going." + "\"" + "<br />" + "- Jim Ryun",
            "\"" + "People rarely succeed unless they have fun in what they are doing." + "\"" + "<br />" + "- Dale Carnegie",
            "\"" + "You may have to fight a battle more than once to win it." + "\"" + "<br />" + "- Margaret Thatcher",
            "\"" + "No one ever drowned in sweat." + "\"" + "<br />" + "– USMC Officer",
            "\"" + "There are no shortcuts to any place worth going." + "\"" + "<br />" + "– Beverly Sills",
            "\"" + "Hard work without talent is a shame, but talent without hard work is a tragedy." + "\"" + "<br />" + "- Robert Hall",
            "\"" + "Start by doing what’s necessary, then what’s possible; and suddenly you are doing the impossible." + "\"" + "<br />" + "– Saint Francis",
            "\"" + "The best way to predict the future is to invent it." + "\"" + "<br />" + "– Alan Kay",
            "\"" + "If you cannot do great things, do small things in a great way." + "\"" + "<br />" + "– Napoleon Hill",
            "\"" + "The journey of a thousand miles begins with one step." + "\"" + "<br />" + "– Lao Tzu",
            "\"" + "You must be the change that you wish to see in the world." + "\"" + "<br />" + "– Gandhi",
            "\"" + "Tough times never last, but tough people do." + "\"" + "<br />" + "– Dr. Robert Schuller",
            "\"" + "Make each day your masterpiece." + "\"" + "<br />" + "– John Wooden",
            "\"" + "Don’t wait. The time will never be just right." + "\"" + "<br />" + "– Napoleon Hill",
            "\"" + "If there is no struggle, there is no progress." + "\"" + "<br />" + "– Frederick Douglass",
            "\"" + "What we fear doing most is usually what we most need to do." + "\"" + "<br />" + "– Tim Ferriss",
            "\"" + "Your imagination is your preview of life’s coming attractions." + "\"" + "<br />" + "– Albert Einstein",
            "\"" + "The harder I work, the luckier I get." + "\"" + "<br />" + "– Gary Player",
            "\"" + "Someday is not a day of the week." + "\"" + "<br />" + "– Denise Brennan-Nelson",
            "\"" + "Champions keep playing until they get it right." + "\"" + "<br />" + "– Billie Jean King",
            "\"" + "Action is the foundational key to all success." + "\"" + "<br />" + "– Pablo Picasso",
            "\"" + "We are what we repeatedly do. Excellence, then, is not an act, but a habit." + "\"" + "<br />" + "– Aristotle",
            "\"" + "To live is the rarest thing in the world. Most people exist, that is all." + "\"" + "<br />" + "– Oscar Wilde",
            "\"" + "I know where I’m going and I know the truth, and I don’t have to be what you want me to be.  I’m free to be what I want." + "\"" + "<br />" + "- Muhammad Ali",
            "\"" + "Problems are not stop signs, they are guidelines." + "\"" + "<br />" + "- Robert H. Schuller",
            "\"" + "Fortune favors the brave." + "\"" + "<br />" + "- Publius Terence",
            "\"" + "Always do your best. What you plant now, you will harvest later." + "\"" + "<br />" + "- Og Mandino",
            "\"" + "You are never too old to set another goal or to dream a new dream." + "\"" + "<br />" + "- C. S. Lewis",
            "\"" + "Don't watch the clock; do what it does. Keep going." + "\"" + "<br />" + "- Sam Levenson",
            "\"" + "Keep your eyes on the stars, and your feet on the ground." + "\"" + "<br />" + "- Theodore Roosevelt",
            "\"" + "Nothing is impossible, the word itself says - I'm possible!" + "\"" + "<br />" + "- Audrey Hepburn",
            "\"" + "Whether you think you can or you think you can’t, you’re right." + "\"" + "<br />" + "- Henry Ford",
            "\"" + "Perfection is not attainable, but if we chase perfection we can catch excellence." + "\"" + "<br />" + "- Vince Lombardi",
            "\"" + "Do or do not. There is no try." + "\"" + "<br />" + "- Yoda",
            "\"" + "Nothing will work unless you do." + "\"" + "<br />" + "- Maya Angelou",
            "\"" + "Remember that not getting what you want is sometimes a wonderful stroke of luck." + "\"" + "<br />" + "- Dalai Lama",
            "\"" + "Don’t judge each day by the harvest you reap but by the seeds that you plant." + "\"" + "<br />" + "- Robert Louis Stevenson"
    };

    String[] quotes_bg = new String[] {
            // "\"" + "quote" + "\"" + "<br />" + "author",
            "\"" + "Нищо велико не е постигнато без ентусиазъм." + "\"" + "<br />" + "- Ралф Уолдо Емерсон",
            "\"" + "Тайната да излезеш начело е да започнеш." + "\"" + "<br />" + "- Марк Твен",
            "\"" + "Искаш да направя нещо... кажи ми, че не мога да го направя." + "\"" + "<br />" + "- Мая Анжело",
            "\"" + "Силата не идва от физическия капацитет. Тя идва от неукротимата воля." + "\"" + "<br />" + "- Махатма Ганди",
            "\"" + "Това, което мислим, определя това, което ни се случва. Затова ако искаме да променим живота си, ние трябва да обогатим ума си." + "\"" + "<br />" + "– Уейн Дайър",
            "\"" + "Никога не се отказвай от това, което наистина искаш да вършиш. Човек с големи мечти е много по-силен от онзи, който борави с всички факти." + "\"" + "<br />" + "– Алберт Айнщайн",
            "\"" + "Проникновение без действия е просто блян. Действия без далновидност е цял кошмар." + "\"" + "<br />" + "– Японска поговорка",
            "\"" + "Успехът се състои в това да се проваляш отново и отново без да губиш ентусиазъм." + "\"" + "<br />" + "- Уинстън Чърчил",
            "\"" + "Повечето велики личности са постигнали най-големия си успех в живота само една малка стъпка след техните най-големи провали." + "\"" + "<br />" + "– Наполиън Хил",
            "\"" + "Нашата най-голяма слабост е в това да се предаваме. Най-сигурният начин да успееш е винаги да се опиташ поне още веднъж." + "\"" + "<br />" + "– Томъс Едисън",
            "\"" + "Бизнесът трябва да бъде ангажиращ, трябва да бъде забава и трябва да ти помага да упражняваш творческите си инстинкти." + "\"" + "<br />" + "– Ричърд Бренсън",
            "\"" + "Понякога, когато въвеждаш иновации, ти правиш грешки. Най-добре е да ги признаеш бързо и да продължиш да подобряваш останалите си нововъведения." + "\"" + "<br />" + "- Стийв Джобс",
            "\"" + "Ако даваш най-доброто от себе си, няма да имаш време да се притесняваш от провал." + "\"" + "<br />" + "– Х. Джексън Браун Джуниър",
            "\"" + "Не се страхувай да се откажеш от нещо добро за да постигнеш нещо велико." + "\"" + "<br />" + "– Джон Рокфелер",
            "\"" + "Повечето хора пропускат възможностите, защото те са маскирани под формата на усилена работа." + "\"" + "<br />" + "– Томъс А. Едисън",
            "\"" + "Волята за победа, желанието за успех, поривът да достигнеш пълния си потенциал…това са ключовете, които ще отворят вратата към високите постижения." + "\"" + "<br />" + "– Конфуций",
            "\"" + "Тайната за жизнерадост в работата се състои в една дума – превъзходство. Да знаеш как да вършиш нещо до съвършенство означава да му се наслаждаваш." + "\"" + "<br />" + "– Пъръл Бък",
            "\"" + "Успелите и неуспелите хора не се различават толкова много в своите умения. Те се различават в тяхното желание да развият пълния си потенциал." + "\"" + "<br />" + "– Джон Максуел",
            "\"" + "За да успееш, твоето желание за успех трябва да е по-голямо от твоя страх от провал." + "\"" + "<br />" + "– Бил Косби",
            "\"" + "По-добре е да запалиш една малка свещичка отколкото да проклинаш тъмнината." + "\"" + "<br />" + "- Конфуций",
            "\"" + "Успехът не е ключа към щастието. Щастието е ключа към успеха. Ако обичаш това, което правиш, ти ще имаш успехи." + "\"" + "<br />" + "– Алберт Швейцер",
            "\"" + "След 20 години, ще си много повече разочарован от нещата, които не си направил, отколкото от тези, които си направил." + "\"" + "<br />" + "– Марк Твен",
            "\"" + "Най-добрия начин да предвидиш бъдещето е да го създадеш." + "\"" + "<br />" + "– Питър Ф. Дракър",
            "\"" + "Всички наши мечти могат да бъдат реалност, ако имаме куража да ги преследваме." + "\"" + "<br />" + "– Уолт Дисни",
            "\"" + "Вярвай в себе си, във всичко, което можеш да направиш… и нещата ще започнат да работят в твоя полза. Трябва да си отворен за подобни сделки и те ще дойдат, уверявам те." + "\"" + "<br />" + "– Ивана Тръмп",
            "\"" + "Независимо дали вярваш, че можеш или вярваш, че не можеш  – и в двата случая си прав!" + "\"" + "<br />" + "– Хенри Форд",
            "\"" + "Ако искате нещо, което никога не сте имали, трябва да направите нещо, което никога не сте правили." + "\"" + "<br />" + "- Томас Джеферсън",
            "\"" + "Работата ни предпазва от три злини: скука, пороци и нужда." + "\"" + "<br />" + "- Волтер",
            "\"" + "Падни 7 пъти, стани 8." + "\"" + "<br />" + "- Японска поговорка",
            "\"" + "Открийте какво правите най-добре и намерете кой да ви плаща за това." + "\"" + "<br />" + "- Кетрин Уайтхорн",
            "\"" + "Един от важните ключове към успеха е самоувереността. Важен ключ към самоувереността е подготовката." + "\"" + "<br />" + "- Артър Аш",
            "\"" + "Успехът се състои в преминаване от провал към провал, без загуба на ентусиазъм." + "\"" + "<br />" + "- Уинстън Чърчил",
            "\"" + "Пропускате 100% от опитите, които не предприемате." + "\"" + "<br />" + "- Уейн Грецки",
            "\"" + "Правете поне по едно нещо на ден, което ви плаши." + "\"" + "<br />" + "- Елинор Рузвелт",
            "\"" + "Възможностите не се предоставят често. Затова, когато ви се предоставят, сграбчете ги." + "\"" + "<br />" + "- Одри Хепбърн",
            "\"" + "Никога не казвайте за себе си нещо, което не бихте искали да се окаже истина." + "\"" + "<br />" + "- Браян Трейси",
            "\"" + "Просто не се отказвайте да правите онова, което искате да правите. Където има любов и вдъхновение, не мисля, че бихте могли да сгрешите." + "\"" + "<br />" + "- Е.Фицджералд",
            "\"" + "Ако нямате визия за бъдещето, то тогава бъдещето ви е заплашено да бъде повторение на миналото." + "\"" + "<br />" + "- А.Бърнард",
            "\"" + "Пропуснал съм над 9000 коша в кариерата си. Загубил съм почти 300 мача, 26 пъти са разчитали да вкарам победния кош… и съм пропускал. Провалял съм се отново и отново и отново през живота си. И точно затова успявам." + "\"" + "<br />" + "- Майкъл Джордан",
            "\"" + "Успехът не е ключът към щастието. Щастието е ключът към успеха. Ако обичате онова, което правите, ще имате успех." + "\"" + "<br />" + "- А.Швайцер",
            "\"" + "Ако нямате мечта, как можете да имате сбъдната мечта?" + "\"" + "<br />" + "- Дж.Крикет",
            "\"" + "Мотивацията е вътрешен огън. Ако някой друг се опита да запали този огън под вас, най-вероятно той ще гори много кратко." + "\"" + "<br />" + "- Стивън Коуви",
            "\"" + "Ако сте отегчени от живота – не ставате всяка сутрин с изгарящо желание да правите нещата – значи нямате достатъчно цели." + "\"" + "<br />" + "- Лу Холц",
            "\"" + "Победата принадлежи на най-упорития." + "\"" + "<br />" + "- Наполеон Бонапарт",
            "\"" + "Не е важно колко е голямо кучето в борбата, а колко голяма е борбата в кучето." + "\"" + "<br />" + "- Марк Твен",
            "\"" + "Никога, никога, никога, никога не се отказвайте." + "\"" + "<br />" + "- Уинстън Чърчил",
            "\"" + "Хората често казват, че мотивацията не трае дълго. Е, същото важи за къпането – затова го препоръчваме ежедневно." + "\"" + "<br />" + "- Зиг Зиглар",
            "\"" + "Не можете да прекосите морето, като просто стоите и гледате водата." + "\"" + "<br />" + "- Рабиндранат Тагор",
            "\"" + "Животът се състои не в това да държите добри карти, а да изиграете добре онези, които държите." + "\"" + "<br />" + "- Джош Билинг",
            "\"" + "Светът прави път на човека, който знае къде отива." + "\"" + "<br />" + "- Ралф Уолдо Емерсън",
            "\"" + "Успех имат онези, които са в състояние да изградят здрави основи от тухлите, с които другите ги замерят." + "\"" + "<br />" + "- Дейвид Бринкл"
    };

    String language = "en";

    // Change String value method
    public String changeString(String lang){
        if (lang.equals("en")) { return "bg"; }
        else return "en";
    }

    // Display random quote
    public void displayRandomQuote(View v){
        Random quote = new Random();
        // Get English quotes
        if (language.equals("en"))
        {
            int randomQuoteIndex = quote.nextInt(quotes.length);
            displayQuote(quotes[randomQuoteIndex]);
        }
        // Get Bulgarian quotes
        if (language.equals("bg"))
        {
            int randomQuoteIndex = quote.nextInt(quotes_bg.length);
            displayQuote(quotes_bg[randomQuoteIndex]);
        }
    }

    // Switch language and adjust image transparency
    public void switchLanguage(View v){
            language = changeString(language);
            changeTransparency();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Method for displaying the quote on the phone's screen
    public void displayQuote(String quote){
        TextView quoteView = (TextView) findViewById(R.id.motivational_quote);
        quoteView.setText(Html.fromHtml("<b><i>" + quote + "</i></b>"));
    }

    // Method for adjusting transparency on the image
    public void changeTransparency(){
        ImageView ali = (ImageView) findViewById(R.id.ali_img);
        if (language.equals("bg")) { ali.setAlpha(.80f); }
        if (language.equals("en")) { ali.setAlpha(.50f); }
    }
}
