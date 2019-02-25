package jp.techacademy.wakahara.koumei.myscheluder

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

// データを格納する「モデル」

open class Schedule : RealmObject() {
    @PrimaryKey
    var id: Long = 0
    var date: Date = Date()
    var title: String = ""
    var detail: String = ""

}