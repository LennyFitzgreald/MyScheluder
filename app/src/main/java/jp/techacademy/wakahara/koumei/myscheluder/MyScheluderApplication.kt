package jp.techacademy.wakahara.koumei.myscheluder

import android.app.Application
import io.realm.Realm

class MyScheluderApplication : Application() {  // Applicationクラスを継承
    override fun onCreate() {                  // ApplicationクラスのonCreateメソッドをオーバーライド
        super.onCreate()
        Realm.init(this)                        // Realmを初期化、引数：contect: (Applicationを継承しているクラス内ならthis)
    }
}