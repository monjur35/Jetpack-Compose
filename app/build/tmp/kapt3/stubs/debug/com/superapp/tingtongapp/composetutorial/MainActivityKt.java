package com.superapp.tingtongapp.composetutorial;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.*;
import androidx.compose.material.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.*;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.tooling.preview.Preview;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem;
import dagger.hilt.EntryPoint;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Conversation", "", "messages", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponse;", "DefaultPreview", "MessageCard", "msg", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponseItem;", "app_debug"})
public final class MainActivityKt {
    
    @androidx.compose.runtime.Composable()
    public static final void MessageCard(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem msg) {
    }
    
    @androidx.compose.runtime.Composable()
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter"})
    public static final void Conversation(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse messages) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, showBackground = true)
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void DefaultPreview() {
    }
}