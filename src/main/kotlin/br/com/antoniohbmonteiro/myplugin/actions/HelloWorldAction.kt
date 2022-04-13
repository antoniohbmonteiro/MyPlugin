package br.com.antoniohbmonteiro.myplugin.actions

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

@Suppress("DEPRECATION")
class HelloWorldAction : AnAction() {
    override fun actionPerformed(actionEvent: AnActionEvent) {

        NotificationGroupManager.getInstance()
            .getNotificationGroup("myActionId")
            .createNotification("My title", "Hello world", NotificationType.INFORMATION)
            .notify(actionEvent.project)

    }
}