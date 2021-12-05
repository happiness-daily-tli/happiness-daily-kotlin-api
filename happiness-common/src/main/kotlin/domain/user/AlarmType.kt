package domain.user

enum class AlarmType(
    private val alarmType: String
) {
    WHOLE_ALARM("전체 알람"),
    POST_ALARM("게시글 알람"),
    COMMENT_ALARM("댓글 알람"),

}