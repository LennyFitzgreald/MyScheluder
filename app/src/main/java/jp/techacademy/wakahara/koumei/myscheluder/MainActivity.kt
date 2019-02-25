package jp.techacademy.wakahara.koumei.myscheluder

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var realm: Realm     // あとからonCreate内で初期化するのでlateinit修飾子をつける

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        realm = Realm.getDefaultInstance()   // Realmクラスのインスタンスを取得、Realmデータベースを使用する準備が完了

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    // Realmのインスタンスを破棄してリソースを解放
    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }
}
