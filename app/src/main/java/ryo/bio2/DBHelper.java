package ryo.bio2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DELL on 2016/03/05.
 */
public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {

    /*
            ここで任意のデータベースファイル名と、バージョンを指定する
            データベースファイル名 = MyTable.db
            バージョン = 1
         */
        super(context, "MyTable.db", null, 1);
    }

    //onCreateメソッド
    /*
    onCreateメソッドはデータベースを初めて使用する時に実行される処理
    ここでテーブルの作成や初期データの投入を行う
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // テーブルの作成
        db.execSQL("CREATE TABLE MyTable " +
                "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Question TEXT" +
                ", Ans0 TEXT" +
                ", Ans1 TEXT" +
                ", Ans2 TEXT" +
                ", Comment TEXT" +
                ", Chap INTEGER" +
                ", Clear INTEGER" +
                ", Done INTEGER" +
                ", Fav INTEGER" +

                ")");


        // 初期データ投入
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('成人の人の細胞の個数は約20兆個である。','×','○','×','60兆個や37兆個と説が別れていますが、現在では37兆個が有力です。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('生物共通の祖先は、単細胞の真核生物であったと考えられる。','×','○','×','生物の祖先は、単細胞の原核生物と考えられています。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values( '原核生物の細胞内にはミトコンドリアや葉緑体は共生していない。','○','○','×','真核生物の細胞内にあるミトコンドリアや葉緑体は真核細胞内に共生していると考えられ、これを共生説といいます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての生物のからだは細胞からできている。','○','○','×','生物は、その細胞の集まり方に応じて、単細胞生物、細胞群体、多細胞生物に分類されます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての生物はDNAを持つ。','○','○','×','全ての生物は遺伝子の本体であるDNAを持ちます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての生物は体内の温度を一定に保つ働きを持つ。','×','○','×','ほとんどの生物には恒常性はありますが、体温を一定に保つのは、鳥類、ほ乳類だけです。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての生物はATPをエネルギーの通貨として使っている。','○','○','×','ATPはアデノシン三リン酸といい、全ての生物が利用できるため「エネルギーの通貨」と呼ばれています。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての細胞には細胞膜がある。','○','○','×','細胞膜は、動物、植物の細胞に区別なく存在します。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての細胞にはリボソームがある。','○','○','×','タンパク質を合成する器官として全ての生物にリボソームが存在します。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('中心体は動物細胞のみが持つ。','×','○','×','主に動物細胞が持ちますが、シダ類などの植物細胞の一部にも存在します。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('中心体は紡錘糸の起点となるほか、べん毛の形成にも関係する。','○','○','×','中心体は精子の尾部の起点になったりもします。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('全ての生物の細胞には核がある。','×','○','×','原核細胞には核はありません。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('真核細胞の核は1つの細胞につき1個である。','×','○','×','細胞の核は1つ（単核）とは限りません。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('細胞膜は、リン脂質とタンパク質からなる。','○','○','×','細胞膜は、リン脂質とタンパク質からなる流動モザイクモデルという構造をしています。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ゾウリムシの収縮胞は浸透圧の調節にはたらく。','○','○','×','収縮胞→浸透圧調節、食胞→消化、細胞口→食べる、と覚えてください。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ゾウリムシの食胞は食物を取り入れる口である。','×','○','×','収縮胞→浸透圧調節、食胞→消化、細胞口→食べる、と覚えてください。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( 'パンドリナやボルボックスなどは多細胞生物に分類される。','×','○','×','細胞群体です。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '細胞が様々な機能の細胞分裂をすることを分化という。','○','○','×','多細胞生物は、幹細胞から様々な機能を持つ細胞に分化します。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '植物の分裂組織には、頂端分裂組織と形成層がある。','○','○','×','植物の組織は、細胞分裂する分裂組織と、しない永久組織に分類できます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '動物の組織には、結合組織・表皮組織・筋組織・神経組織がある。','×','○','×','表皮組織は植物の名称で、動物では上皮組織といいます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '植物の表皮組織は葉緑体を持つ。','×','○','×','表皮組織は基本的に葉緑体を持ちませんが、孔辺細胞だけは葉緑体を持ちます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '血液は結合組織である。','○','○','×','血液は結合組織に分類され、細胞間物質は血しょうです。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('骨格筋は横紋筋に分類される。','○','○','×','横紋筋には、骨格筋、心筋が含まれます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ホルモンが分泌される器官は、神経組織に分類される。','×','○','×','内分泌腺で、上皮組織に分類されます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ゴルジ体はタンパク質などの分泌にはたらく。','○','○','×','ゴルジ体は、タンパク質などの物質の分泌にはたらきます。そのため、細胞の中でも分泌が活発な腺細胞などでよく発達しています。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('細胞質には、ミトコンドリアなど細胞小器官は含まない。','×','○','×','細胞質は、細胞の核以外の部分を指し、細胞質基質の他、さまざまな細胞小器官を含めた部分を指します。細胞質基質は、細胞質から細胞小器官をとった部分にあたります。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ミトコンドリアは、細胞呼吸の場となり、糖を産生する。','×','○','×','ミトコンドリアは、細胞呼吸の場となり、糖からATPを産生します。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('葉緑体は、アントシアンなどの色素が光エネルギーを取り込んで有機物を合成する場である。','×','○','×','葉緑体に含まれるのは、クロロフィルという緑色の色素で、クロロフィルが光エネルギーを取り込んで活性化クロロフィルとなり、光合成をおこなっていきます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('液胞は、植物細胞で特に大きく発達し、内部は液胞液という液体で満たされている。','×','○','×','液胞の内部は細胞液で満たされ、タンパク質や糖などの物質の貯蔵をしています。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('細胞壁は、植物細胞の他、菌類や原核細胞にも存在する。','○','○','×','細胞壁は、セルロースやペクチンから出来ており、植物細胞の他、菌類や原核細胞にも細胞壁があることに注意して下さい。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトの組織でその割合の一番多いものは、上皮組織である。','×','○','×','ヒトの組織でその割合の一番多いものは結合組織です。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('光学顕微鏡で観察できる大きさは長径2μm程度である。','×','○','×','光学顕微鏡では、およそ0.2μm（200nm）まで観察できます。（分解能は0.2μmといえます。）',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ある物体を接眼ミクロメーターと対物ミクロメーターを使って測ったところ、対物ミクロメーターは8目盛り、接眼ミクロメーターは20目盛りで一致していた。、ある物体はは、接眼ミクロメーター2目盛り分の大きさであった。このとき、ある物体の大きさは、4㎛といえる。','×','○','×','対物ミクロメーターは1目盛り10㎛固定なので、接眼ミクロメーター1目盛りは、8×10㎛÷20＝4㎛になります。対象は、接眼ミクロメーター2目盛り分なので、4㎛×2＝8μmが答えになります。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('フックは、コルク片を自作の顕微鏡で観察しているときにコルク片が小さな小部屋からできていることを発見しこれを細胞と名付けた。','○','○','×','細胞（cell）を発見したのはフックです。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('シュライデンは動物細胞で、生物体の基本単位が細胞であるという、細胞説を提唱した。','×','○','×','シュライデンは、植物細胞の研究で細胞説を提唱しました。動物で細胞説を提唱したのはシュワンです。',1,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('代謝には、同化と異化がある。','○','○','×','代謝は生体内で物質を合成したり分解したりすることで、合成を同化、分解を異化といいます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( 'ADPはATPからリン酸が1つ取れたものである。','○','○','×','リン酸どうしは高エネルギーリン酸結合とよばれる結合をしており、その結合が取れることで、エネルギーが放出されます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( 'ATPのリン酸の結合を高エネルギーリン酸結合と呼ぶ。','○','○','×','リン酸どうしは高エネルギーリン酸結合とよばれる結合をしており、その結合が取れることで、エネルギーが放出されます。',1,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('脂質からできている触媒を酵素という。','×','○','×','酵素の主成分はタンパク質です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('基質特異性とは、ある基質はある触媒とのみ反応する事をいう。','×','○','×','ある触媒はある基質とのみ反応する事を基質特異性といいます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('酵素が最適温度や最適pH以外で働きを失うことを変性という。','×','○','×','酵素の働きを失うことを失活といいます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( 'アミラーゼの最適pHはpH7である。','○','○','×','アミラーゼの最適pHは中性の7です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( 'ペプシンの最適pHはpH８である。','×','○','×','ペプシンの最適pHは強酸性で2です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('トリプシンの最適pHはpH８である。','○','○','×','トリプシンの最適pHはアルカリ性の8です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('カルビンベンソン回路はチラコイドで行われる。','×','○','×','カルビンベンソン回路はストロマで行われます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('光エネルギーでアントシアンという色素が活性化される。','×','○','×','葉緑体のクロロフィルが、活性クロロフィルになります。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('光合成でできるエネルギー物質は主にタンパク質である。','×','○','×','光合成でできる物質は主にデンプンです。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('呼吸はミトコンドリア内でのみ行われる。','×','○','×','解糖系は細胞質基質で行われます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('呼吸で作られるATP量は発酵の9倍の量になる。','×','○','×','呼吸では38ATP、発酵では2ATPがつくられますので、19倍です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('クエン酸回路はマトリックスで行われる。','○','○','×','クエン酸回路はマトリックスで行われ、2ATPがつくられます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('呼吸の電子伝達系では、クエン酸回路の17倍のATPができる。','○','○','×','電子伝達系では34ATP、クエン酸回路では2ATPがつくられます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('呼吸の電子伝達系はマトリックスで行われる。','×','○','×','電子伝達系はクリステで行われます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ミトコンドリアや葉緑体は生体膜である二重膜に包まれている。','○','○','×','ミトコンドリアが二重膜で包まれていることは、共生説の根拠の1つになっています。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('アミラーゼは、タンパク質をアミノ酸に分解するはたらきをする。','×','○','×','アミラーゼは、だ液に含まれデンプンをマルトース（麦芽糖）に分解するはたらきを持っています。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('マルターゼはマルトースをグルコース（ブドウ糖）に分解する。','○','○','×','マルターゼは、小腸で分泌され、マルトースをグルコースに分解するはたらきを持ちます。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('リパーゼはすい臓で分泌され、脂肪をアミノ酸に分解する。','×','○','×','リパーゼはすい臓で分泌され、小腸（十二指腸）で脂肪を脂肪酸とグリセリンに分解します。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ペプシンは胃液に含まれ、タンパク質をペプチドに分解する。','○','○','×','ペプシンは胃液に含まれ、タンパク質をペプチド（ペプトン）に分解します。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('トリプシンは胃液に含まれ、タンパク質をペプチドに分解する。','×','○','×','トリプシンは、膵液に含まれており、小腸（十二指腸）で、タンパク質やペプチドを、より小さなポリペプチドやアミノ酸に分解します。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('カタラーゼは二酸化マンガン（酸化マンガン（Ⅳ））と同様に過酸化水素水を酸素と水に分解する。','○','○','×','カタラーゼは、細胞内に含まれ特に肝細胞に多く含まれており、過酸化水素水を酸素と水に分解する酵素です。',2,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('酵素は基質の反応を促進するだけで、酵素自体は変化しない。','○','○','×','酵素は基質の反応を促進するだけで、酵素自体は変化しません。よって何度も利用することが出来ます。',2,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('メンデルはソラマメを用いた実験で遺伝の法則を発見した。','×','○','×','エンドウで実験しました。成長がはやく大量にできるので、実験に適しているからです。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('グリフィスとエイブリ―は二重らせん構造を提唱した。','×','○','×','グリフィスは形質転換を、エイブリ―は形質転換がDNAによることを発見しました。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ハーシーとチェイスは二重らせん構造を提唱した。','×','○','×','ハーシーとチェイスは、バクテリオファージを用いた実験で、遺伝物質がDNAであることを発見しました。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ワトソンとクリックは二重らせん構造を提唱した。','○','○','×','ワトソンとクリックはDNAの2本鎖が二重らせん構造をとることを提唱しました。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAの正式名称はリボ核酸である。','×','○','×','DNAの正式名称はデオキシリボ核酸で、含まれる糖はデオキシリボースです。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('RNAの正式名称はリボ核酸である。','○','○','×','RNAの正式名称はリボ核酸で、含まれる糖はリボースです。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAを構成する塩基はデオキシリボースである。','×','○','×','デオキシリボースは糖の名称です。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAやRNAを構成する糖にはそれぞれ4種類ある。','×','○','×','4種類あるのは塩基で、DNAはアデニン、チミン、グアニン、シトシン、RNAはアデニン、ウラシル、グアニン、シトシンです。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAやRNAの構成単位はヌクレオチドだがATPは違う。','×','○','×','ATPも構成単位はヌクレオチドです。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('相補的な塩基どうしの結合は水素結合による。','○','○','×','塩基どうしの結合は水素結合で比較的離れやすくなっています。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('AT、CGの塩基量がそれぞれ等しいことをモーガンの規則という。','×','○','×','シャルガフの規則といいます。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトのDNAの総塩基対は約32億塩基対ある。','○','○','×','ヒトの総塩基対は約32億対、遺伝子数は約2万個と覚えてください。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトの遺伝子数は約2万個ある。','○','○','×','より正確には20500程度と言われています。',3,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('真核生物はゲノムのほぼ全部の情報を使用している。','×','○','×','真核生物では、ゲノムのごく一部しか使用されていません。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('原核生物はゲノムのほぼ全部の情報を使用している。','○','○','×','原核生物では、真核生物と異なりゲノムのほとんどが使用されています。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('体細胞分裂では通常1つの母細胞から2つの娘細胞ができる。','○','○','×','体細胞分裂では1回の分裂で2個の娘細胞に分かれます。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('減数分裂では通常１つの母細胞から4つの娘細胞ができる。','○','○','×','減数分裂は、第一分裂と第二分裂の2回の分裂があり、2個→4個となります。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('体細胞分裂では、分裂の前後で核相は半減する。','×','○','×','核相は同じで、2n→2nと表わされます。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトの常染色体数は44本の22対である。','○','○','×','その他に性染色体が2本の1対あるので、総染色体数は46本23対になります。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('複製されたDNAは元のDNA鎖を1本ずつ含む。','○','○','×','これを半保存的複製といいます。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('間期でDNAを複製するのはG1期である。','×','○','×','G1期はDNA合成準備期、S期はDNA合成期、G2期は分裂準備期なので、答えはS期です。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('分裂期の前期から終期の終わりまでは核分裂を行っている。','×','○','×','終期の後半は細胞質分裂をしています。細胞分裂の分類はいろいろあるので、うまく使い分けられるようにして下さい。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('分裂期の前期には染色体が赤道面に並ぶ。','×','○','×','染色体が赤道面に並ぶのは中期です。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('減数分裂の第1分裂中期と第2分裂中期で染色体の並び方は同じである。','×','○','×','第一分裂では二価染色体が赤道面に並び、対合面で分かれていくのに対し、第二分裂では染色体が赤道面に一列に並び、縦列面で分かれていきます。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('減数分裂では細胞数は4つできるので、核相も1/4になる。','×','○','×','核相は1/2になり、2n→nと表わされます。',4,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNA→RNA→タンパク質の流れをセントラルドグマという。','○','○','×','DNAが転写によりmRNAに、mRNAがリボソームにおいて翻訳される事でタンパク質がつくられる一連の流れをセントラルドグマといいます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAの2本鎖がほどけて1本になったものがRNAである。','×','○','×','DNAの2本鎖の一方が複製されたものがRNAです。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('DNAの塩基配列をmRNAに写し取る過程を翻訳という。','×','○','×','写し取るので言葉通り転写です。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('転写は核内で行われる。','○','○','×','転写は核の中で、翻訳はリボソームで行われます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('RNAの塩基配列で遺伝情報を持たない部分をエキソンという。','×','○','×','遺伝情報を持つ部分をエキソン、持たない部分をイントロンといいます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('RNAの塩基配列はリボソームと結合して3つずつ読み取られる。','○','○','×','これをトリプレットといいます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('mRNAの3つずつの塩基配列をコドンという。','○','○','×','mRNAのトリプレットをコドンといいます。tRNAのトリプレットはアンチコドンです。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('アミノ酸の種類は全部で64種類である。','×','○','×','コドンは4の3乗で64種類できますが、重複や無意味なものもあり、アミノ酸の種類は20種類です。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('リゾチームは細菌の細胞膜を破壊して体内への侵入を防ぐ。','×','○','×','リゾチームは細菌の細胞壁を破壊します。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('カタラーゼと同じ働きを持つ触媒には二酸化マンガンがある。','○','○','×','どちらも過酸化水素水を水と酸素に分解します。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('細胞が特定の機能や働きを持つように変化することを分裂という。','×','○','×','細胞が分裂によって特定の機能や働きを持つことを分化といいます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('だ腺染色体は通常の染色体の150～200倍の大きさである。','○','○','×','非常に巨大なため観察しやすくなっています。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('だ腺染色体の染色体数が半数しかないのは減数分裂の為である。','×','○','×','相同染色体が対合した状態の為、染色体数は半数しか観察されません。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('だ腺染色体の膨らんだ部分をパフという。','○','○','×','染色体が部分的にほどけた状態で膨らんでいます。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('パフでは転写が盛んに行われmRNAが合成されている。','○','○','×','パフの位置にある遺伝子が盛んに発現していることがわかります。',5,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('パフの位置は時期に応じて変化する。','○','○','×','発生時期に応じて発現する遺伝子が変わっていくことがわかります。',5,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('体液である血液、組織液、リンパ液の液体成分はそれぞれ異なる。','×','○','×','血液の血しょう、組織液、リンパ液は同じもので、存在する場所によって呼び方が変わっています。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('自律神経と内分泌系の最高中枢は脳下垂体である。','×','○','×','自律神経と内分泌系の最高中枢は間脳視床下部です。間脳視床下部は、「間脳」や「視床下部」だけで出題される場合もありますが同じ意味で考えてください。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('赤血球の大きさは7～8nmである。','×','○','×','7～8㎛です。nmは㎛の1/1000の単位です。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('成人で約450万～500万個の赤血球をもつ。','○','○','×','成人女性で450万、男性で500万個ほどです。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヘモグロビンは酸素や二酸化炭素の運搬に関わる。','×','○','×','酸素に関しては正解ですが、二酸化炭素の運搬は血しょうです。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('一般に1番大きな血球は白血球である。','○','○','×','白血球は様々な種類があり、大きさは5～20㎛ですが、一般的に血球の中では1番大きなものに分類されます。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('リンパ球は白血球の１種である。','○','○','×','リンパ球は、白血球の一種で、細胞性免疫や抗体産生などに関係します。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血球はそれぞれ核を持つ。','×','○','×','白血球は有核ですが、赤血球、血小板は無核です。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('３種の血球の中で１番数が少ないのは血小板である。','×','○','×','1番少ないのは白血球で4000～9000個です。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血小板は血液凝集にはたらく。','×','○','×','血液凝固にはたらきます。血液凝集と血液凝固は言葉が似ているので注意して下さい。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血球はどれも骨髄でつくられる。','○','○','×','血球はどれも骨髄でつくられます。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('赤血球は肝臓でビリルビンに分解される。','○','○','×','肝臓では、赤血球中のヘモグロビンが分解されビリルビンとなり、胆汁の成分になる。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトは開放血管系を持つ。','×','○','×','ヒトの血管系は毛細血管でつながった閉鎖血管系です。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ミミズは開放血管系を持つ。','×','○','×','ミミズなどの環形動物は脊椎動物と同じ閉鎖血管系を持ちます。切った時に赤い血液が出るのは閉鎖血管系、出ないのが開放血管系だとイメージして下さい。例えば、タコ・イカ・エビ・昆虫などが開放血管系になります。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('心室から動脈への出口にある弁は房室弁である。','×','○','×','心室から動脈への弁は半月弁といいます。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('自動的に興奮が伝わる細胞の塊に洞房結節がある。','○','○','×','洞房結節がペースメーカの役割をしています。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('右心室→肺動脈→肺→肺静脈→左心房の循環を小循環という。','○','○','×','小循環または肺循環といいます。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('酸素を1番多く含む血液が流れるのは肺動脈である。','×','○','×','肺静脈の血液が、肺で酸素をもらってすぐなので酸素を一番多く含みます。逆に肺に入る直前の肺動脈は一番酸素が少ない血液になります。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('動脈血が流れる血管は、大動脈と肺静脈である。','○','○','×','酸素の多い鮮血色の動脈血は、各組織の毛細血管に入る前の大動脈と肺静脈でみられます。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヒトの心臓は2心房2心室である。','○','○','×','ほ乳類と鳥類の心臓は2心房2心室からなります。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('トロンビンは、血球をからめとり血餅をつくる。','×','○','×','トロンビンはフィブリノーゲンをフィブリンに変える酵素です。血球をからめとるのはフィブリンです。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('クエン酸ナトリウムを血液に加えるとトロンビンが出来ない。','○','○','×','トロンビンの材料になるカルシウムイオンがクエン酸ナトリウムと反応してなくなるため、トロンビンができなくなります。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血液を低温に保つと凝固しないのはトロンビンが酵素の為である。','○','○','×','トロンビンは酵素なので、低温で失活します。',6,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血液をガラス棒でかき交ぜるとフィブリンを絡め取り凝固しない。','○','○','×','フィブリンは粘っこいので、ガラス棒でからめとることが出来ます。',6,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓は体内最大の臓器である。','○','○','×','成人で約1.2～2㎏の重さです。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓には肝小葉が約100万個存在する。','×','○','×','肝小葉は約50万個あります。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('１つの肝小葉には約50万個の肝細胞が存在する。','○','○','×','1つの肝小葉には約50万個の肝細胞があります。肝臓で出てくる個数はどちらも50万個と覚えておきましょう。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝門脈は肝臓から静脈へ流れ出る血管である。','×','○','×','肝門脈は、消化管から肝臓へ入る血管で、最も血糖が多く含まれる血液が流れています。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓はグルコースをグリコーゲンに分解する働きがある。','×','○','×','グルコースを合成してグリコーゲンになります。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓はグリコーゲンからグルコースに分解する働きもある。','○','○','×','血糖値が低いときは肝臓内のグリコーゲンをグルコースに分解します。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓はタンパク質の合成を行う。','○','○','×','血しょう中のタンパク質のほとんどは肝臓で合成されています。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('アンモニアを尿素にかえる働きをカルビンベンソン回路という。','×','○','×','オルニチン回路といいます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('肝臓は体内で最も熱を発する器官である。','×','○','×','最も発するのは筋肉で、肝臓は２番目です。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('腎臓は、人体に2つついている。','○','○','×','腎臓は、ヒトの腹腔の背側の左右に一対の２個あります。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('腎臓１個は約100万個のネフロン（腎単位）からなる。','○','○','×','腎臓１つにつき100万個のネフロンがあります。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('マルピーギ小体はボーマン嚢と糸球体からなる。','○','○','×','さらにマルピーギ小体と腎細管を合わせて腎単位といいます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ボーマン嚢でろ過されないのは血球、タンパク質、血糖である。','×','○','×','血球やタンパク質はろ過されませんが、血糖はろ過されます。但し、すべて再吸収されるので、普通は尿中には含まれません。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血しょうがろ過され腎細管に入ったものを原尿と呼ぶ。','○','○','×','血しょうがボーマン嚢でろ過されたものを原尿、再吸収後集合管に入って尿となっていきます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('水は腎細管でのみ再吸収される。','×','○','×','水分は主に集合管で再吸収されます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('水の再吸収を促進するホルモンは、副甲状腺から分泌される。','×','○','×','バソプレシンというホルモンが脳下垂体後葉から分泌されます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('Na+の再吸収を促進するホルモンは糖質コルチコイドである。','×','○','×','鉱質コルチコイドというホルモンで、分泌場所は糖質コルチコイドと同じ副腎皮質です。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('再吸収は能動輸送で行われている。','○','○','×','再吸収は浸透圧に逆らった能動輸送です。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('受動輸送にはATPがエネルギーとして使われる。','×','○','×','受動輸送では、浸透圧に従った移動が起こるのでエネルギーは必要ありません。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('海水魚は口から海水を大量に飲む。','○','○','×','海水魚は周りの海水より浸透圧が低いため、自然と水分が出ていきます。それを補うために口から大量の水を取り込みます。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('淡水魚は多量で等張の尿を排出する。','×','○','×','淡水魚は周りより浸透圧が高いため、水が体内に入ってきます。そのため尿は大量に出しますが、塩類は不足しがちになるので、低張の尿を出します。',7,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('淡水魚は能動輸送でエラから塩類を排出する。','×','○','×','体内の塩類が不足するのでエラからは塩類を取り込みます。',7,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('白血球は骨髄にある造血幹細胞でつくられる','○','○','×','白血球を含む血球はすべて、造血幹細胞でつくられます。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('リンパ球にはB細胞やT細胞がある。','○','○','×','リンパ球には、Ｂ細胞、Ｔ細胞、ＮＫ細胞などがあります。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('白血球の食作用は獲得免疫と呼ばれる。','×','○','×','食作用は、自然免疫です。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('皮膚はアルカリ性に保たれ細菌の増殖を防ぐ。','×','○','×','皮膚は弱酸性に保たれて細菌の増殖を防いでいます。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('食作用の後抗原提示が行われ、B細胞が感知する。','×','○','×','抗原提示はヘルパーＴ細胞が受け取ります。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ヘルパーＴ細胞は抗原によって細胞性免疫と体液性免疫に振り分ける。','○','○','×','ヘルパーＴ細胞が抗原に応じて、細胞外に抗原がある場合は体液性免疫、細胞自体が抗原と認識された場合は細胞性免疫に振り分けます。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('体液性免疫では、キラーT細胞が増殖する。','×','○','×','体液性免疫ではＢ細胞が増殖し、Ｂ細胞が抗体産生細胞や記憶細胞へと分化ます。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('B細胞は抗体産生細胞となり抗体をつくる。','○','○','×','分化した抗体産生細胞は、抗体を産生し体液中に分泌します。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('B細胞の一部が記憶細胞となり体内に残るのを免疫記憶という。','○','○','×','記憶細胞が1度侵入した抗原を記憶していることを免疫記憶、免疫記憶により2回目以降の抗原侵入時には速やかで強い免疫反応を起こすことを二次応答といいます。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('抗体は、特定の抗原にのみ働く。','○','○','×','抗体の構造は、抗原によって可変部が異なり、可変部の一致する抗原にのみ作用します。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('予防接種のワクチンは細胞性免疫を利用したものである。','×','○','×','ワクチンは体液性免疫を利用しています。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ABO式血液型で凝集原はA、B、Oがある。','×','○','×','凝集原はＡとＢの2種類があります。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('凝集原は抗原にあたる。','○','○','×','凝集原が抗原、凝集素が抗体になっています。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('凝集原Aと凝集素αが共存すると凝固反応を起こす。','×','○','×','凝固反応ではなく、凝集反応を起こします。血液の凝集反応は赤血球どうしが付着し塊になる反応です。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('AB型では、凝集素は存在しない。','○','○','×','ＡＢ型の血液は、ＡとＢの両方の抗原を持ちますが、抗体のαとβはどちらも持ちません。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ツベルクリン反応は細胞性免疫を利用したものである。','○','○','×','ツベルクリン反応は、結核菌の免疫を細胞性免疫を利用して調べるものです。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('HIVはB細胞に感染し、免疫不全を起こすウイルスである。','×','○','×','HIVはヘルパーT細胞に感染します。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('即時型アレルギーは体液性免疫によるものである。','○','○','×','即時型アレルギーは体液性免疫、遅延型アレルギーは細胞性免疫が原因になります。',8,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血清療法では、患者自身の体内では抗体をつくらない。','○','○','×','血清療法は、他の生物から得た抗体を利用するもので、自身で抗体はつくりません。',8,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('神経細胞はニューロンと呼ばれる。','○','○','×','神経細胞はニューロンと同義です。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('軸索に髄鞘が巻き付いた神経を有髄神経という。','○','○','×','髄鞘は絶縁体の為、興奮は跳躍伝導により無髄神経より速く伝わります。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('シナプス間はアセチルコリンなどで次の神経に伝導する。','×','○','×','シナプス間は、神経伝達物質により伝達します。ニューロンでは電気の興奮が伝導します。伝導と伝達は引っかけ問題に出やすいので注意して下さい。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ( '交感神経の神経伝達物質はアドレナリンである。','×','○','×','交感神経の神経伝達物質はノルアドレナリンです。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('副交感神経での神経伝達物質はアセチルコリンである。','○','○','×','副交感神経をはじめ、交感神経以外の神経伝達物質はアセチルコリンと生物基礎では覚えておいてください。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('運動神経での神経伝達物質はアセチルコリンである。','○','○','×','運動神経の神経伝達物質もアセチルコリンです。',9,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('大脳の皮質は白質である。','×','○','×','大脳の皮質は神経細胞の細胞体が多く集まって灰白色をしており、灰白質とよばれます。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('大脳の新皮質は高度な精神活動を司る。','○','○','×','新皮質は、高度な精神活動など、人間らしい部分、旧皮質は、性欲、食欲などの動物が元々持っている部分を司っています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('間脳、中脳、小脳、延髄をまとめて脳幹という。','×','○','×','脳幹には小脳は含まれません。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('中脳は、眼球運動、姿勢保持などにはたらく。','○','○','×','中脳は、眼球運動や、瞳孔の収縮、姿勢保持にはたらきます。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('小脳は、筋肉運動の調節、平衡を保つことにはたらく。','○','○','×','小脳は筋肉運動の調節や、平衡感覚の調節などにはたらいています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('延髄は、呼吸、心臓の拍動、食道のぜん動運動などにはたらく。','○','○','×','延髄は、呼吸、循環、消化などの生命維持に不可欠な機能の調節にはたらいています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('脊髄では、髄質が白質である。','×','○','×','脊髄は、大脳とは逆で、髄質が灰白色をしており、皮質が白色になっています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('感覚神経は、体性神経であり、遠心性神経である。','×','○','×','器官から中心である脳に向かう神経を求心性神経、その逆を遠心性神経といいます。感覚神経は、受容器官で受け取った刺激を脳に伝えますから、求心性神経に分類されます。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('運動神経は、自律神経であり、遠心性神経である。','×','○','×','運動神経は、感覚神経と共に体性神経であり、大脳の指令を器官に向かって伝えるので遠心性神経に分類されます。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('交感神経は、自律神経である。','○','○','×','交感神経も副交感神経も自律神経です。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('交感神経は、脊髄を起点とする。','○','○','×','交感神経は、脊髄からのみ出ています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('副交感神経は、脊髄を起点としない。','×','○','×','副交感神経は、脊髄の先端にある仙髄や、延髄、中脳からも出ています。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('迷走神経は、交感神経の一種である。','×','○','×','迷走神経は延髄から出ている副交感神経の一種です。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('交感神経が働くと、皮膚の血管は拡張する。','×','○','×','寒いときには交感神経が働き皮膚の血管を収縮し、体温の放出を押さえます。立毛筋の収縮も同じです。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('副交感神経は、胃のぜん動運動を促進する。','○','○','×','副交感神経は、安静時にはたらき、消化器官などは活動が促進されます。食後眠たくなるのは、副交感神経が働いて消化が活発になるためです。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('交感神経は、瞳孔を縮小する。','×','○','×','交感神経は活動的な時にはたらきますから、周りをよく見るために瞳孔は拡大します。',9,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('交感神経は、心臓の拍動を促進する。','○','○','×','活動的な時は、多くの酸素やエネルギーが必要となりますから、交感神経が働くときには心臓の拍動も促進されます。',9,0,0,0);");

        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ホルモンは、神経に比べ作用が持続的である。','○','○','×','ホルモンは神経に比べ作用にかかる時間は遅いが持続的に作用します。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ホルモンは、神経に比べ急激に作用する。','×','○','×','ホルモンは神経に比べ作用にかかる時間は遅いが持続的に作用します。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血糖を増加させるホルモンにはグルカゴンなどがある。','○','○','×','血糖を増加させるホルモンには、グリコーゲンの分解を促進させる、グルカゴンやアドレナリン、タンパク質から糖をつくる糖質コルチコイドがあります。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('すい臓には交感神経のみがつながっている。','×','○','×','副交感神経もあり、インスリンの分泌の調節をしています。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('脳下垂体後葉からは、オキシトシン、バソプレシンが分泌される。','○','○','×','脳下垂体後葉では、水分の再吸収を促進するバソプレシンと子宮筋の収縮などにはたらくオキシトシンが分泌されます。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('脳下垂体前葉からは各種刺激ホルモンやチロキシンが分泌される。','×','○','×','脳下垂体前葉から各種の刺激ホルモンの他、成長ホルモンなどが分泌されます。チロキシンは甲状腺から分泌されるホルモンです。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('チロキシンは血中カルシウム濃度増加にはたらく。','×','○','×','チロキシンは代謝の促進にはたらき、血中カルシウム濃度増加にはたらくのはパラトルモンです。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('チロキシンは副甲状腺から分泌される。','×','○','×','チロキシンは甲状腺から分泌され、副甲状腺からはパラトルモンが分泌されます。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('糖質コルチコイドは、グリコーゲンから血糖をつくる。','×','○','×','糖質コルチコイドはタンパク質からグリコーゲンをつくります。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('グルカゴンとアドレナリンは、糖に関しては同じ働きをする。','○','○','×','グルカゴンもアドレナリンも、グリコーゲンを分解して　グルコースをつくる働きがあります。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('間脳がチロキシン増加を感知すると正のフィードバックが起こる。','×','○','×','間脳がチロキシンなどの増加を感知すると、それを減らそうとする負のフィードバックがはたらきます。',10,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('血糖は、通常100㎖中100㎎含まれており、約１％である。','×','○','×','血糖は、通常100㎖中100㎎含まれており、約0.1％になります。',10,0,0,0);");


        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('陸上のバイオームはその地域の生物の相観により区別される。','×','○','×','陸上のバイオームはその地域に生育する植物の相観で区分されます。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('非生物的環境には、気温、降水量、日照時間などがある。','○','○','×','環境は、生物的環境と、非生物的環境に分けられ、非生物的環境には気候要因と土壌要因があります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('茎は同化器官に区別される。','×','○','×','同化器官とは、光合成をする器官で、葉が同化器官にあたります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('ラウンケルは休眠芽の地表面からの高さで生活形を区別した。','○','○','×','休眠芽が地表30cm以上にあるものを地上植物、30cm以下を地表植物、地表にあるものを半地中植物、地中にあるものを地中植物、種子で過ごすものを一年生植物、水中で過ごすものを水生植物に分類しました。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('タンポポやススキは半地中植物である。','○','○','×','休眠芽が地表にある半地中植物には、タンポポやススキがあります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('チューリップやヒマワリは一年生植物である。','×','○','×','ヒマワリは種子で過ごす一年生植物ですが、チューリップは、地中の球根で過ごす地中植物です。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('階層構造は熱帯多雨林と針葉樹林では熱帯多雨林の方が発達する。','○','○','×','階層構造は一般的には熱帯多雨林で一番発達し、針葉樹林ではあまり発達しません。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('低木層では、一般に陽生植物が発達する。','×','○','×','低木層では、日光が届きにくいので、陰生の植物の方が発達しやすくなっています。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('陽生植物は陰生植物より光補償点は低いが光飽和点は高い。','×','○','×','陽生植物は陰生植物よりも光補償点も光飽和点も高くなります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('光の強さに関係なく陽樹の方が陰樹よりも多くの二酸化炭素を吸収する。','×','○','×','一定以下の光量ならば、陰生植物の方が多くの二酸化炭素を吸収します。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('陽葉は陰葉よりも一般的に肉厚が厚く葉は小さい。','○','○','×','陽葉の方が陰葉よりもさく状組織が厚くなり、その為、葉の肉厚も厚くなり、大きさは小さくなっています。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('森林の土壌は上から落葉層、腐植層、岩石層の順になる。','○','○','×','森林の土壌は上から落葉層、腐植層、岩石層の順になります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('荒原では、イネやコケ類が発達する。','×','○','×','荒原では、地衣類、コケ類がよく発達します。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('補償深度より上の水深を成長層という。','×','○','×','補償深度より浅い部分を生産層といいます。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('澄んだ湖は濁った湖より補償深度は深い。','○','○','×','澄んだ湖は、深いところまで光が届きますので、補償深度は深くなります。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('澄んだ湖は一般的に富栄養湖である。','×','○','×','澄んだ湖は、栄養が少なくプランクトンが少ないために澄んでいます。',11,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('十分な降水量があると雨緑樹林が発達することはない。','○','○','×','雨緑樹林が発達する地域の平均気温で十分な降水量があると、熱帯多雨林や亜熱帯多雨林になります。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('夏緑樹林は針葉樹林よりも暖かい地域で見られる。','○','○','×','降水量が十分にあるならば、気温の高い順に、熱帯多雨林→亜熱帯多雨林→照葉樹林→夏緑樹林→針葉樹林の順になります。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('一般に年降水量が500㎜を超えると森林のバイオームがみられる。','×','○','×','年降水量が1000㎜を超えると森林のバイオームが発達します。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('年平均気温が－5℃以下なら降水量に関係なくツンドラが発達する。','○','○','×','年平均気温が－5℃以下なら降水量に関係なくツンドラが発達します。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('年降水量が200㎜以下なら平均気温に関係なく砂漠になる。','×','○','×','降水量が200㎜以下でも年平均気温が低い場合はツンドラが発達します。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('マングローブは主に照葉樹林で見られる。','×','○','×','マングローブは、熱帯多雨林や亜熱帯多雨林で見られます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('日本の本州の平地部分は照葉樹林が多く見られる。','○','○','×','日本の平地部分のバイオームは、亜熱帯多雨林から針葉樹林まで含まれますが、本州は南側は照葉樹林が、北側は夏緑樹林が多く見られます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('針葉樹林は日本では見られない。','×','○','×','針葉樹林は、日本でも北海道の一部や亜高山帯などで見られます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('高度によるバイオームの分布を水平分布という。','×','○','×','高度による分布は垂直分布、緯度による分布を水平分布といいます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('高山帯ではお花畑がみられる。','○','○','×','高山帯では、コマクサやシャクナゲのお花畑が見られます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('一次遷移は二次遷移よりも遷移のスピードが速い。','×','○','×','遷移の速度は、元々土壌のある二次遷移の方が速く進みます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('遷移は、荒原→草原→低木林→陰樹林→混交林→陽樹林とすすむ。','×','○','×','荒原→草原→低木林→陽樹林→混交林→陰樹林の順になります',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('遷移がこれ以上進まなくなる段階を極相という。','○','○','×','遷移の最終段階を極相（クライマックス）といいます。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('極相に達すると、相観が変わることはない。','×','○','×','極相に達しても、ギャップ更新などで相観が変わることはあります。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('二次遷移は伐採された森林や、溶岩台地などで始まる。','×','○','×','溶岩台地は一次遷移です。二次遷移は、伐採された森林や、休耕田など元々土壌のあるところからの遷移を指します。',12,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('生物から非生物的環境への働きかけを作用という。','×','○','×','非生物的環境から生物への働きかけを作用、その逆を反作用（環境形成作用）といいます。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('生物どうしの影響を与え合うことを相互作用という。','○','○','×','生物どうしが互いに影響を与え合っていることを相互作用といいます。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('一次消費者とは肉食動物を指す。','×','○','×','一次消費者は、植物である生産者を捕食する草食動物です。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('分解者に分類されるのは、菌類だけである。','×','○','×','分解者には、菌類、細菌類があてはまります。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('食物網とは、食物連鎖が複雑に網の目になっている関係である。','○','○','×','食物連鎖は、実際は複数の捕食、被食の関係が混ざって網の目のようになっており、これを食物網といいます。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('個体数ピラミッドは形が逆転せずエネルギーピラミッドは逆転する。','○','○','×','生態ピラミッドのうち、個体数ピラミッドと生物量ピラミッドはピラミッドの形が逆転する時がありますが、エネルギーピラミッドは逆転することなく、必ず下の段階のエネルギー量が大きくなっています。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('炭酸同化は光合成に含まれる。','×','○','×','同化のなかに炭酸同化は含まれ、炭酸同化の中に光合成が含まれています。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('二酸化炭素を減らすのは植物だけである。','×','○','×','海水による二酸化炭素の吸収もあります。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('分解者以外の生物は全て呼吸を行う。','×','○','×','分解者も呼吸をしています。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('生物間の炭素の移動は主に摂食によって行われる。','○','○','×','生物間の炭素の移動は有機物の摂食による移動を指します。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('窒素固定とは大気中の窒素ガスからアンモニウムイオンをつくる事である。','○','○','×','窒素固定とは、大気中の窒素ガスからアンモニウムイオンを作るはたらきのことです。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('窒素固定は、窒素固定細菌や空中放電などで行われる。','○','○','×','窒素固定は、アゾトバクターや根粒菌などの窒素固定細菌のはたらきや、空中放電などによる固定等があります。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('窒素同化とは、窒素からデンプンをつくる事である。','×','○','×','窒素同化とは、窒素固定でできたアンモニウムイオンなどを用いてアミノ酸をつくるはたらきを指します。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('アンモニアは脱窒により空気中に窒素としてもどる。','×','○','×','脱窒は直接的には、硝酸イオンから窒素をつくることです。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('純生産量は総生産量から呼吸量を引いたものである。','○','○','×','純生産量＝総生産量－呼吸量、成長量＝純生産量－（枯死量＋被食糧）になります。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('摂食量は同化量とも言う。','×','○','×','同化量＝摂食量－不消化排出量です。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('生産者の総生産量は消費者の摂食量にあたる。','○','○','×','生産者の純生産量は消費者で言うところの摂食量にあたります。',13,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('エネルギーは全て循環している。','×','○','×','熱エネルギーは循環せずに放出されます。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('富栄養化が起こる原因は汚水などの有機物の流入である。','×','○','×','富栄養化の原因は、生活排水や汚水などの無機物の流入や、分解者による有機物の無機物への分解が原因になります。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('高次消費者が環境よりも高濃度な物質をもつ事を生物濃縮という。','○','○','×','生物濃縮により、食物連鎖の高次の生物により高濃度で物質が蓄積されます。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('地球温暖化の主な原因は二酸化炭素と言われている。','○','○','×','地球温暖化の原因は化石燃料の大量使用による二酸化炭素の増加などが原因と言われています。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('オゾン層の破壊の主な原因はメタンと言われている。','×','○','×','オゾン層はフロンによって破壊され、紫外線が直接地表にあたることで、皮膚がんの原因となったりします。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('酸性雨の原因は窒素酸化物や硫黄酸化物である。','○','○','×','酸性雨は窒素酸化物や硫黄酸化物などにより雨や雪などが酸性になったもので、森林の立ち枯れの増加の原因となったりしています。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('一度失われた生態系はヒトが手を加えないと元に戻らない。','×','○','×','失われた生態系は、そのまま放置しておいても戻ることもあれば、人が手を加えても戻らない事もあります。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('淡水湖が富栄養化すると、生産層は深くなる。','×','○','×','透明度が下がるので、生産層は浅くなります。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('BODやCODの値が小さいほど、その水は汚染されている。','×','○','×','BODやCODは水中の有機物汚染の程度を示す指標で、数値が大きいほど汚染されているといえます。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('汚水が流入すると細菌類が増える。','○','○','×','汚水に含まれる有機物を分解するために細菌類が増えます。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('細菌類による有機物の分解でアンモニウムイオンが生じる。','○','○','×','細菌に分解されたアンモニウムイオンは、硝化され、硝酸イオンに変えられて藻類に吸収されることにより、次第に浄化されます。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('温室効果を引き起こすのは二酸化炭素だけである。','×','○','×','二酸化炭素だけでなく、フロンやメタンも温室効果を持っています。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('オゾン層は赤外線を吸収する。','×','○','×','オゾン層は紫外線を吸収しています。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('化石燃料の燃焼は地球温暖化とのみ関係がある。','×','○','×','化石燃料の燃焼は、二酸化炭素だけでなく、窒素酸化物なども放出するので、酸性雨の原因ともなります。',14,0,0,0);");
        db.execSQL("INSERT INTO MyTable(Question,Ans0, Ans1, Ans2,Comment,Chap, Clear, Done, Fav) values ('化石燃料の燃焼は地球温暖化とのみ関係がある。','×','○','×','化石燃料の燃焼は、二酸化炭素だけでなく、窒素酸化物なども放出するので、酸性雨の原因ともなります。',15,0,0,0);");



        //４択問題テーブル
        db.execSQL("CREATE TABLE Select4 " +
                "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Question TEXT" +
                ", Ans0 TEXT" +
                ", Ans1 TEXT" +
                ", Ans2 TEXT" +
                ", Ans3 TEXT" +
                ", Ans4 TEXT" +
                ", Comment TEXT" +
                ", Chap INTEGER" +
                ", Clear INTEGER" +
                ", Done INTEGER" +
                ", Fav INTEGER" +

                ")");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞を覆う半透性の膜を何と呼ぶか。','細胞膜','細胞壁','細胞膜','細胞質基質','液胞','細胞膜や核膜、ミトコンドリアなどの生体膜は半透性の二重幕になっています。細胞壁は全透性です。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAとタンパク質からなり、分裂時に太いひも状のようになるものは何か。','染色体','染色体','繊毛','中心体','核小体','遺伝子の本体であるDNAは、染色体に含まれており、細胞分裂の前期には凝集して観察しやすくなります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('（好気）呼吸によってエネルギーを生産する細胞小器官は何か。','ミトコンドリア','ミトコンドリア','葉緑体','細胞質基質','ゴルジ体','ミトコンドリアは呼吸によってグルコースからATPを作ります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('扁平な袋状で、細胞内の物質を細胞外に分泌するものは何か。','ゴルジ体','ミトコンドリア','葉緑体','液胞','ゴルジ体','「扁平な袋状」「物質の分泌」のキーワードが来たら、ゴルジ体です。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('主に動物の細胞だけに存在し、分裂時に紡錘体の起点となる細胞小器官は何か。','中心体','葉緑体','中心体','染色体','核小体','中心体は主に動物細胞で見られますが、植物でもシダ類などには見られる点に注意してください。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('植物特有の光合成をする細胞小器官は何か。','葉緑体','ミトコンドリア','葉緑体','中心体','ゴルジ体','葉緑体は光合成によって、光エネルギーを使って、水と二酸化炭素からデンプンなどの有機物を合成します。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('おもに植物細胞で発達し、内部に無機塩類や糖などを含むものは何か。','液胞','葉緑体','細胞壁','液胞','中心体','液胞は、植物細胞で目立ち、特に古い細胞ほど大きくなります。液胞に含まれる色素として、「アントシアン」も覚えておいてください。動物細胞では、あっても目立たないことから、主に植物細胞で見られると出題されることが多いです。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('植物特有のセルロースを主成分とした構造体を何と呼ぶか。','細胞壁','細胞壁','細胞膜','液胞','細胞質基質','細胞壁は、植物特有の構造体で、セルロースやペクチンを主成分として出来ています。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞小器官の隙間を埋める物質を何と呼ぶか。','細胞質基質','細胞壁','細胞膜','液胞','細胞質基質','細胞質基質と細胞質は解答するときに間違いやすいですが、「細胞質基質＝細胞質−細胞小器官」と考えるようにしてください。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞内でタンパク質を合成する場となる細胞小器官は何か。','リボソーム','小胞体','ミトコンドリア','リボソーム','リソソーム','核内で作られたmRNAの塩基配列をもとに、リボソームでタンパク質が合成されます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞質内の物質輸送に働くものは何か。','小胞体','小胞体','ミトコンドリア','リボソーム','リソソーム','小胞体はmRNAやタンパク質などの物質が移動する通路になっています。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('核膜の内外の物質の出入りをする穴はなにか。','核膜孔','核小体','核膜孔','小胞体','リボソーム','核膜にある穴（孔）を核膜孔といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞内消化に働き、加水分解酵素を含むものは何か。','リソソーム','小胞体','細胞質基質','リボソーム','リソソーム','リソソームは細胞内消化にはたらきます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ミトコンドリア内部の突出した膜構造を何と呼ぶか。','クリステ','マトリックス','クリステ','チラコイド','ストロマ','ミトコンドリア内の構造体の部分を「クリステ」、構造体に囲まれた部分を「マトリックス」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ミトコンドリアの内膜に囲まれた部分を何と呼ぶか。','マトリックス','マトリックス','クリステ','チラコイド','ストロマ','ミトコンドリア内の構造体の部分を「クリステ」、構造体に囲まれた部分を「マトリックス」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('葉緑体内部の扁平な袋状の膜を何と呼ぶか。','チラコイド','クリステ','チラコイド','ストロマ','グラナ','葉緑体内の構造体を「チラコイド」、チラコイドが層状に重なった部分を「グラナ」、それ以外の構造体に囲まれた部分を「ストロマ」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('チラコイドが層状になった構造を何と呼ぶか。','グラナ','グラナ','ストロマ','マトリックス','クリステ','葉緑体内の構造体を「チラコイド」、チラコイドが層状に重なった部分を「グラナ」、それ以外の構造体に囲まれた部分を「ストロマ」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('チラコイドの間の基質を何と呼ぶか。','ストロマ','グラナ','ストロマ','マトリックス','クリステ','葉緑体内の構造体を「チラコイド」、チラコイドが層状に重なった部分を「グラナ」、それ以外の構造体に囲まれた部分を「ストロマ」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('葉緑体内にある光合成に必要な色素は何か。','クロロフィル','クロロフィル','アントシアン','ストロマ','セルロース','葉緑体内のクロロフィルは、光を浴びることで活性化クロロフィルとなり光合成を行います。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞壁の主成分を答えよ。','セルロース','クロロフィル','アントシアン','ストロマ','セルロース','細胞壁は、セルロースやペクチンを主成分としています。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('次のうち真核生物に分類されるものはどれか。','菌類','シアノバクテリア','ラン藻類','菌類','細菌類','原核生物は、細菌類、ラン藻類、シアノバクテリアなどで、それ以外は基本的に真核生物と考えてください。ただし、細菌類と菌類をしっかり区別するようにしてください。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('核膜が存在せず、核と細胞質が区切られていない生物を何と呼ぶか。','原核生物','原核生物','真核生物','単細胞生物','多細胞生物','原核生物は核（膜）がなく、ミトコンドリアや葉緑体などの細胞小器官もありません。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('核膜に包まれた核を持つ細胞を何と呼ぶか。','真核生物','原核生物','真核生物','単細胞生物','多細胞生物','真核生物は、核（膜）があり、ミトコンドリアや葉緑体（植物のみ）などの細胞小器官があります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('１個の細胞で個体を構成する生物を何と呼ぶか。','単細胞生物','単細胞生物','細胞群体','多細胞生物','真核生物','単細胞生物に分類されるものには、「大腸菌（原核）」「ゾウリムシ（真核）」「ミドリムシ（真核）」などがよく出題されます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('多くの細胞が集まって１つの個体を構成する生物を何と呼ぶか。','多細胞生物','単細胞生物','細胞群体','多細胞生物','真核生物','生物は、単細胞生物→細棒群体→多細胞生物と進化してきました。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('単細胞生物が集団を形成し、1つの個体のように生活するものを何と呼ぶか。','細胞群体','細胞体','細胞群体','多細胞生物','原核生物','細棒群体に分類されるものには、「オオヒゲマワリ（ボルボックス）」「クンショウモ」「パンドリナ」などがあります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞内で細胞小器官が流れるように動く現象を何と呼ぶか。','原形質流動','原形質解離','原形質流動','原形質移動','原形質分離','細胞質基質の流動で細胞小器官が細胞内で動いていることを原形質流動といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('植物の分裂組織に含まれるものを選びなさい。','形成層','表皮組織','形成層','柔組織','機械組織','植物の分裂組織には、頂端分裂組織と形成層があります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('植物の根や茎の先端の分裂組織を何と呼ぶか。','頂端分裂組織','頂端分裂組織','茎頂分裂組織','根端分裂組織','形成層','頂端分裂組織はさらに、茎頂分裂組織と根端分裂組織に分けられます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('表皮組織の中で葉緑体を持つ細胞は何か。','孔辺細胞','表皮細胞','孔辺細胞','根毛細胞','柔細胞','植物の表皮組織の細胞のほとんどは葉緑体を持ちませんが、孔辺細胞は葉緑体をもちます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('根で吸収した水や無機塩類の通路を何と呼ぶか。','道管（木部）','道管（木部）','師管（師部）','維管束','仮道管','植物内の道灌は水の通路となり、師管は栄養分などの通路となります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('葉で合成された物質の通路を何と呼ぶか。','師管（師部）','道管（木部）','師管（師部）','維管束','仮道管','植物内の道灌は水の通路となり、師管は栄養分などの通路となります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('形成層が見られる植物を何と呼ぶか。','双子葉植物','双子葉植物','単子葉植物','被子植物','裸子植物','双子葉植物には形成層が見られます。形成層での細胞分裂により、横に肥大することから、一般的に双子葉植物の方が単子葉植物よりも茎が太くなります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('葉のおもて面に柔細胞が密に集まった組織を何と呼ぶか。','さく状組織','厚壁組織','厚角組織','さく状組織','海綿状組織','葉のおもて面には柔細胞が密になったさく状組織があり、裏面は柔細胞のまばらな海面上組織が分布しています。柔細胞は葉緑体を持つため、葉のおもて面の方が裏面よりも濃い緑色をしています。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('さく状組織や海綿状組織は何組織系に属するか。','基本組織系','表皮組織系','維管束系','基本組織系','分裂組織','さく状組織や海面上組織は、基本組織系に分類されます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('動物の組織に含まれないものを一つ選びなさい。','表皮組織','表皮組織','結合組織','筋組織','神経組織','動物の表皮などは、表皮組織ではなく、「上皮組織」といいます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('分泌腺は何組織に分類されるか。','上皮組織','上皮組織','結合組織','筋組織','神経組織','上皮組織には、外皮や内皮だけでなく、分泌腺や網膜なども含まれます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血液は何組織に分類されるか','結合組織','上皮組織','結合組織','筋組織','神経組織','結合組織は、硬骨組織、軟骨組織、血液などがあります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('心臓は主に何組織からできているか','筋組織','上皮組織','結合組織','筋組織','神経組織','筋組織には、骨格筋、心筋、内臓筋などがあります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('網膜は何組織に分類されるか。','上皮組織','上皮組織','結合組織','筋組織','神経組織','網膜は上皮組織に分類されます。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('軟骨・硬骨は何組織に分類されるか。','結合組織','上皮組織','結合組織','筋組織','神経織','硬骨・軟骨は結合組織です。軟骨である腱も結合組織になります。筋組織と間違わないようにしてください。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('硬骨の主な細胞間物質は何か。','カルシウム','タンパク質','コラーゲン','脂肪','カルシウム','硬骨はカルシウム、軟骨はコラーゲン、血液は血しょうが細胞間物質になります。','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血液の細胞間物質は何か。','血しょう','赤血球','白血球','血小板','血しょう','硬骨はカルシウム、軟骨はコラーゲン、血液は血しょうが細胞間物質になります。','1','1','0','0');");



        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('化学反応を促進し、自身は変化しない物質を何と呼ぶか。','触媒','基質','ATP','試材','触媒','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酵素が作用する物質が決まっている性質を何と呼ぶか。','基質特異性','基質特異性','失活','最適温度','最適ｐH','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('デンプンをマルトースに分解する酵素を選べ。','アミラーゼ','マルターゼ','スクラーゼ','リパーゼ','アミラーゼ','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('マルトースをグルコース（ブドウ糖）に分解する酵素を選べ。','マルターゼ','マルターゼ','スクラーゼ','リパーゼ','アミラーゼ','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('胃でタンパク質を分解する酵素を選べ。','ペプシン','トリプシン','カタラーゼ','ペプシン','リパーゼ','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('小腸でタンパク質を分解する酵素名を答えよ。','トリプシン','トリプシン','カタラーゼ','ペプシン','リパーゼ','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酵素が最もよく働く時の温度を何と呼ぶか。','最適温度','適温度','最適温度','良好温度','活動温度','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('過酸化水素水を水と酸素に分解する酵素を選べ。','カタラーゼ','トリプシン','カタラーゼ','ペプシン','リパーゼ','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酵素が基質と結合する部分を何と呼ぶか。','活性部位','結合部位','酵素基質結合体','活性部位','反応物','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酵素に最適温度や最適ｐHががあるのは、酵素の主成分 に関係しているがそれは何か。','タンパク質','カルシウム','コラーゲン','脂質','タンパク質','あ','1','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('複雑な物質を単純な物質へ分解し、エネルギーを取り出す過程を何と呼ぶか。','異化','同化','異化','呼吸','光合成','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('単純な物質からエネルギーを用いて複雑な物質を合成する過程を何と呼ぶか。','同化','同化','異化','呼吸','光合成','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('同化の代表的なものを次から選べ。','光合成','呼吸','発酵','光合成','変性','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('異化の代表的なものを次から選べ。','呼吸','光合成','呼吸','変性','分解','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('呼吸では1分子のグルコースから何個のATPがつくられるか。','３８','４','８','３４','３８','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('呼吸の電子伝達系で合成されるATPはいくつか。','３４','４','８','３４','３８','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('呼吸のうちミトコンドリア内で合成されるATPはいくつか。','３６','４','３４','３６','３８','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('グルコースをピルビン酸に分解する過程を何と呼ぶか。','解糖系','解糖系','クエン酸回路','電子伝達系','カルビン・ベンソン回路','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ピルビン酸がミトコンドリアでクエン酸となる過程を何と呼ぶか。','クエン酸回路','解糖系','クエン酸回路','電子伝達系','カルビン・ベンソン回路','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酸素を用いない有機物の分解を何と呼ぶか。','発酵','呼吸','光合成','異化','発酵','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ストロマで起こる、CO2を固定して有機物を合成する回路は何か。','カルビンベンソン回路','解糖系','クエン酸回路','電子伝達系','カルビン・ベンソン回路','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('代謝において、エネルギーの受け渡しに関係する物質の正式名称は何か。','アデノシン三リン酸','アデニン','アデノシン','アデノシン二リン酸','アデノシン三リン酸','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ATPはリン酸を放出して何という物質に変わるか、正式名称で答えよ。','アデノシン二リン酸','アデニン','アデノシン','アデノシン二リン酸','アデノシン三リン酸','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ミトコンドリアや葉緑体は大きな細胞に共生して進化したものと考えられるが、その根拠として正しくないものを選べ。','内部で独自に移動する','核に存在するものとは異なる遺伝子をもっている','DNAは、原核生物と同じ環状構造をもつ','二重膜構造からなる','内部で独自に移動する','あ','2','1','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('RNAとDNAとの構造の違いで間違っているものはどれか。','構成するリン酸の数が異なる','構成する塩基の種類が異なる','構成する糖の種類が異なる','構成するリン酸の数が異なる','ヌクレオチド鎖の数が異なる','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAからmRNAがつくられる事を何と呼ぶか。','転写','転移','転写','複製','翻訳','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('mRNAの塩基配列に従ってリボソームでタンパク質をつくる事を何と呼ぶか。','翻訳','転移','転写','複製','翻訳','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAを構成する糖は何か。','デオキシリボース','アデニン','チミン','リボース','デオキシリボース','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAを構成する塩基として間違っているものはどれか。','ウラシル','ウラシル','チミン','アデニン','グアニン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('RNAを構成する糖は何か。','リボース','アデニン','チミン','リボース','デオキシリボース','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('RNAを構成する塩基でDNAと異なるものは何か。','ウラシル','チミン','グアニン','ウラシル','シトシン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAの構成単位であり、鎖状につながっているものは何か。','ヌクレオチド','ヒストン','ゲノム','核酸','ヌクレオチド','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('AとT,CとGがそれぞれ同じ割合で存在することを何と呼ぶか','シャルガフの規則','シャルガフの規則','形質転換','二重らせん構造','メンデルの法則','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('真核細胞の染色体でDNAが巻きついているタンパク質は何か。','ヒストン','ゲノム','ヒストン','ヌクレオチド','DNAポリメラーゼ','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNA複製時に新しいヌクレオチド鎖を合成する酵素は何か。','DNAポリメラーゼ','ゲノム','ヒストン','ヌクレオチド','DNAポリメラーゼ','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('mRNAは、どこに伝わるか。','リボソーム','小胞体','ミトコンドリア','リソソーム','リボソーム','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('mRNAの3個のヌクレオチドに対応したアミノ酸を運搬するものは何か。','tRNA','DNA','mRNA','tRNA','rRNA','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNA→RNA→タンパク質という遺伝情報の流れを何と呼ぶか。','セントラルドグマ','翻訳','転写','ゲノム','セントラルドグマ','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('個体が生命活動を営むのに必要なすべての遺伝情報を何と呼ぶか。','ゲノム','遺伝子','DNA','ゲノム','染色体','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('アミノ酸が多数結合したものを何と呼ぶか。','タンパク質','ポリペプチド','タンパク質','脂質','炭水化物','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('アミノ酸どうしは何という結合で繋がっているか。','ペプチド結合','ペプチド結合','水素結合','高エネルギーリン酸結合','相補的結合','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('タンパク質は動物のからだの約何％を占めるか。','20%','10%','20%','40%','60%','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('軟骨に多く含まれるタンパク質は何か。','コラーゲン','アクチン','ミオシン','カルシウム','コラーゲン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肺炎双球菌から形質転換を発見した人物は誰か。','グリフィス','グリフィス','エイブリ―','ハーシー','ワトソン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('形質転換がDNAによることを発見したのは誰か。','エイブリ―','グリフィス','エイブリ―','ハーシー','ワトソン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('バクテリオファージの実験で遺伝物質がDNAであることを発見した2名を答えよ。','ハーシーとチェイス','シュワンとシュライデン','ワトソンとクリック','グリフィスとエイブリ―','ハーシーとチェイス','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('2重らせん構造を発見した2名は誰か。','ワトソンとクリック','シュワンとシュライデン','ワトソンとクリック','グリフィスとエイブリ―','ハーシーとチェイス','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('エンドウマメから遺伝の法則を発見したのは誰か。','メンデル','フック','メンデル','シュワン','シュライデン','あ','3','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('グリフィスの実験で明らかになった事として正しいものはどれか。','細胞は形質転換する事があるという事','S型菌は有害である事','R型菌は有害である事','細胞は形質転換する事があるという事','形質転換の原因物質はDNAである事','あ','3','0','0','0');");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞分裂の結果できる細胞を何と呼ぶか。','娘細胞','母細胞','親細胞','娘細胞','子細胞','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('体細胞分裂前期の特徴として正しくないものはどれか。','染色体が対合し二価染色体をつくる','染色体が太く短くなる','染色体が対合し二価染色体をつくる','核膜が見えなくなる','核小体が見えなくなる','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('体細胞分裂中期の特徴をとして正しくないものはどれか。','それぞれの二価染色体が赤道面に並ぶ','紡錘糸が伸びて紡錘体をつくる','紡錘糸が染色体の動原体に付着する','染色体が赤道面に一列に並ぶ','それぞれの二価染色体が赤道面に並ぶ','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('植物の体細胞分裂終期の特徴として正しくないものはどれか。。','細胞質がくびれて細胞が２つに分かれる','染色体が細い糸状に戻り見えなくなる','細胞質がくびれて細胞が２つに分かれる','細胞板が現れる','核膜や核小体が現れる','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('体細胞分裂でDNAが複製される時期はいつか。','間期','間期','前期','後期','終期','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('形や大きさの等しい対になった染色体をそれぞれ何と呼ぶか。','相同染色体','常染色体','性染色体','二価染色体','相同染色体','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('DNAが複製されるのは間期のどの時期か。','S期','G1期','S期','G2期','G3期','あ','4','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ハエやユスリカなどの幼虫にみられる巨大な染色体を何というか。','だ腺染色体','巨大染色体','大型染色体','だ腺染色体','ランプブラシ染色体','あ','4','0','0','0');");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ヒトの内部環境の体液として適切でないものはどれか。','胃液','胃液','血液','組織液','リンパ液','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ヒトの赤血球の個数は約何個か。','450万～500万個','6000～9000個','20万～30万個','45万～50万個','450万～500万個','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ヒトの白血球の個数は約何個か。','6000～9000個','6000～9000個','20万～30万個','45万～50万個','450万～500万個','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ヒトの血小板の個数は約何個か。','20万～30万個','6000～9000個','20万～30万個','45万～50万個','450万～500万個','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('赤血球の働きとして適切なものはどれか。','酸素の運搬','二酸化炭素の運搬','酸素の運搬','食作用','血液凝固','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('白血球の働きとして適切なものはどれか。','食作用','二酸化炭素の運搬','酸素の運搬','食作用','血液凝固','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血小板の働きとして適切なものはどれか。','血液凝固','二酸化炭素の運搬','酸素の運搬','食作用','血液凝固','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血しょうの働きとして適切でないものはどれか。','酸素の運搬','二酸化炭素の運搬','ホルモンの運搬','老廃物の運搬','酸素の運搬','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('左心室から出る血管は何か。','大動脈','大動脈','大静脈','肺動脈','肺静脈','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('左心房に入る血管は何か。','肺静脈','大動脈','大静脈','肺動脈','肺静脈','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('右心室から出る血管は何か。','肺動脈','大動脈','大静脈','肺動脈','肺静脈','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('右心房に入る血管は何か。','大静脈','大動脈','大静脈','肺動脈','肺静脈','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('動脈血が流れている血管はどれか。','肺静脈','大静脈','肺静脈','肺動脈','肝門脈','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('静脈血が流れている血管はどれか。','肺動脈','大動脈','肺静脈','肺動脈','毛細血管','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('グルコースを最も多く含む血液が流れている血管はどれか。','肝門脈','肝静脈','肝動脈','肝門脈','類洞','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('閉鎖血管系を持たない生物は次のうちどれか。','イカ','ヒト','カエル','イカ','ミミズ','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('魚類の心臓の構造を答えよ。','1心房1心室','1心房1心室','1心房2心室','2心房1心室','2心房2心室','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('は虫類の心臓の構造を答えよ。','2心房1心室','1心房1心室','1心房2心室','2心房1心室','2心房2心室','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('鳥類の心臓の構造を答えよ。','2心房2心室','1心房1心室','1心房2心室','2心房1心室','2心房2心室','あ','6','0','0','0');");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('酸素ヘモグロビンは酸素分圧が（　）く、二酸化炭素分圧が（　）いほど酸素を解離しやすい。','低・高','高・高','高・低','低・高','低・低','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肺胞での酸素ヘモグロビンが95％、組織での酸素ヘモグロビンが30％のとき、組織で解離した酸素ヘモグロビンは、全ヘモグロビンの何％か。','65％','30％','65％','68.4％','95％','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肺胞での酸素ヘモグロビンが95％、組織での酸素ヘモグロビンが30％のとき、組織で解離した酸素ヘモグロビンは酸素ヘモグロビンの何％か。','68.4％','30％','65％','68.4％','95％','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('プロトロンビンをトロンビンに変えるときに使われるイオンは何か。','カルシウムイオン','ナトリウムイオン','カルシウムイオン','カリウムイオン','水素イオン','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('トロンビンの活性を低下させるにはどのようにすればよいか。','低温に保つ','低温に保つ','高温に保つ','クエン酸ナトリウムを加える','ガラス棒でかき混ぜる','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('トロンビンの生成を防ぐにはどのようにすればよいか。','クエン酸ナトリウムを加える','低温に保つ','高温に保つ','クエン酸ナトリウムを加える','ガラス棒でかき混ぜる','あ','6','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血餅をつくる直接の因子は何か','フィブリン','フィブリノーゲン','フィブリン','プロトロンビン','トロンビン','あ','6','0','0','0');");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ( '肝臓の働きとして間違っているものを選べ。','胆汁の分泌','グリコーゲンの合成・分解','尿素の合成','胆汁の分泌','熱の発生','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肝臓まわりの血液の循環経路として正しいものを選べ。','肝門脈→類洞→中心静脈→肝静脈','肝門脈→類洞→中心静脈→肝静脈','肝門脈→中心静脈→類洞→肝静脈','肝門脈→類洞→肝静脈→中心静脈','肝門脈→肝静脈→類洞→中心静脈','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肝臓には約何個の肝小葉が存在するか。','50万個','5千個','5万個','50万個','500万個','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('1つの肝小葉は約何個の肝細胞からなるか','50万個','5千個','5万個','50万個','500万個','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('肝臓のオルニチン回路について正しいものはどれか。','アンモニアを尿素につくりかえる','グリコーゲンを合成する','アンモニアを尿素につくりかえる','胆汁を合成する','アルコールを分解する','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('1個の腎臓には約何個のネフロン（腎単位）があるか。','100万個','10万個','30万個','100万個','300万個','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('次のうちネフロンに含まれないものはどれか','集合管','糸球体','ボーマン嚢','細尿管（腎細管）','集合管','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('マルピーギ小体（腎小体）を構成する部位はどれか。','糸球体＋ボーマン嚢','糸球体＋ボーマン嚢','糸球体＋細尿管','ボーマン嚢＋細尿管','細尿管＋集合管','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ボーマン嚢でろ過されずに原尿に含まれない物質は何か。','タンパク質','グルコース','タンパク質','ナトリウムイオン','尿素','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ろ過はされるが、通常100％再吸収されて尿中に含まれないのは何か。','グルコース','グルコース','タンパク質','ナトリウムイオン','尿素','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血液中の塩類濃度が低いときに分泌されるホルモンは何か。','鉱質コルチコイド','パラトルモン','バソプレシン','糖質コルチコイド','鉱質コルチコイド','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('血液中の塩類濃度が高いときに分泌されるホルモンは何か。','バソプレシン','パラトルモン','バソプレシン','糖質コルチコイド','鉱質コルチコイド','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('再吸収はATPを使って浸透圧に逆らった物質の移動をするが、これを何と呼ぶか。','能動輸送','受動輸送','チャネル','能動輸送','ナトリウムポンプ','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('赤血球内に多いイオンは何か。','カリウムイオン','ナトリウムイオン','カルシウムイオン','カリウムイオン','水素イオン','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ナトリウムポンプは、ナトリウムイオンをどのように移動する仕組みか。','能動輸送で赤血球外に出す','受動輸送で赤血球内に入れる','受動輸送で赤血球外に出す','能動輸送で赤血球内に入れる','能動輸送で赤血球外に出す','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('海水魚は口から（　　）量の海水を飲み、エラから塩類を（　　）、（　　）張の尿を（　　）量出す。','多・排出し・等・少','多・取り込み・低・少','少・排出し・低・多','少・排出し・等・少','多・排出し・等・少','あ','7','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('淡水魚は口から（　　）量の淡水を飲み、エラから塩類を（　　）、（　　）張の尿を（　　）量出す。','少・取り込み・低・多','多・取り込み・低・少','少・取り込み・低・多','少・排出し・等・少','多・排出し・低・少','あ','7','0','0','0');");

        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('ニューロンの核のある部分を何と呼ぶか。','細胞体','樹状突起','細胞体','軸索','髄鞘','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞体から出ている枝分かれした短い突起を何と呼ぶか。','樹状突起','樹状突起','細胞体','軸索','髄鞘','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('細胞体から1本出ている長い突起を何と呼ぶか。','軸索','樹状突起','細胞体','軸索','髄鞘','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('有髄神経繊維の興奮の伝わり方を何と呼ぶか。','跳躍伝導','飛躍伝達','飛躍伝導','跳躍伝達','跳躍伝導','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('刺激を受けていない神経細胞の細胞内は負の電位に帯電していることを何と呼ぶか。','静止電位','停止電位','静止電位','活動電位','活発電位','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('興奮が軸索を伝わる事を何と呼ぶか。','伝導','伝導','伝達','伝搬','刺激','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('シナプス間を神経伝達物質が伝わる事を何というか。','伝達','伝導','伝達','伝搬','刺激','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('交感神経のシナプス間を伝わる神経伝達物質は何か。','ノルアドレナリン','アドレナリン','ノルアドレナリン','アセチルコリン','セロトニン','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('交感神経以外のシナプス間を伝わる神経伝達物質は何か。','アセチルコリン','アドレナリン','ノルアドレナリン','アセチルコリン','セロトニン','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('次のうち遠心性神経に含まれないものはどれか。','感覚神経','感覚神経','運動神経','交感神経','副交感神経','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('次のうち自律神経の組み合わせとして適当なものを選べ。','交感神経・副交感神経','感覚神経・運動神経','感覚神経・副交感神経','交感神経・運動神経','交感神経・副交感神経','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('自律神経の最高中枢は脳のどの部分か。','間脳','大脳','中脳','間脳','小脳','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('感覚や精神活動の中枢がある脳の部分はどこか。','大脳','大脳','中脳','間脳','小脳','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('姿勢保持や眼球運動の中枢はどこか。','中脳','大脳','中脳','間脳','小脳','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('筋肉運動の調節に関係する中枢はどこか。','小脳','延髄','中脳','間脳','小脳','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('呼吸や心臓の拍動などの中枢はどこか。','延髄','延髄','中脳','間脳','小脳','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('大脳皮質は、ニューロンのどの部分が多く集まり何と呼ばれるか。','細胞体・灰白質','細胞体・白質','細胞体・灰白質','軸索・白質','軸索・灰白質','あ','9','0','0','0');");
        db.execSQL("INSERT INTO Select4(Question,Ans0, Ans1, Ans2,Ans3,Ans4,Comment,Chap, Clear, Done, Fav) values ('脊髄の皮質は、ニューロンのどの部分が多く集まり何と呼ばれるか。','軸索・白質','細胞体・白質','細胞体・灰白質','軸索・白質','軸索・灰白質','あ','9','0','0','0');");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table is exist MyTable");
        onCreate(db);
        // とりあえず今回は空でOK
    }
}



