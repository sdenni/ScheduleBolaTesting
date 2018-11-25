package com.example.s_denni.googledevkotlin_submission4_denni_1.basisdata

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.Kareseps
import org.jetbrains.anko.db.*

class MyDatabaseOpenHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, "KaresepJadwal.db", null, 1) {
    companion object {
        private var instance: MyDatabaseOpenHelper? = null

        @Synchronized
        fun getInstance(ctx: Context): MyDatabaseOpenHelper {
            if (instance == null) {
                instance = MyDatabaseOpenHelper(ctx.applicationContext)
            }
            return instance as MyDatabaseOpenHelper
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.createTable(Kareseps.TABLE_KARESEP, true,
            Kareseps.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
            Kareseps.ID_SCHEDULE to TEXT + UNIQUE,
            Kareseps.ID_KENCA to TEXT,
            Kareseps.ID_KATUHU to TEXT,
            Kareseps.KENCA_NAME to TEXT,
            Kareseps.KATUHU_NAME to TEXT,
            Kareseps.KENCA_SCORE to TEXT,
            Kareseps.KATUHU_SCORE to TEXT,
            Kareseps.TANGGAL_LIGA to TEXT
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable(Kareseps.TABLE_KARESEP, true)
    }
}

val Context.database: MyDatabaseOpenHelper
    get() = MyDatabaseOpenHelper.getInstance(applicationContext)