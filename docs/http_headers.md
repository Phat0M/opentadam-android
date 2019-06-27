# Заголовки


* **Hive-Profile**: `string` Идентификатор профиля мобильного приложения, определяющий набор тарифов, региональные настройки в рамках которых будут приниматься заказы. Один сервер может предоставлять несколько таких контекстов одновременно. Выдается владельцем сервера. |
* **Accept-Language**: `string` Нужен для формирования локализованных текстов сообщений для отображения в мобильном приложении. Значение локали должно соответсвовать стандарту [RFC 2616](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4). Если это значение не указано – будут использоваться текущие региональные настройки сервера
* **X-Hive-GPS-Position**: `string` Текущие координаты устройства (координаты точки, отображенной на карте клиента) в формате “{latitude} {longitude}”. <br>**Пример:** `X-Hive-GPS-Position: 55.0355 73.3012`