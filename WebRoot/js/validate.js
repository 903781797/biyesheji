/**
			 * 评论字数统计
			 */
			function funcomment() {
				var text = document.getElementById('comment');
				var textnum = text.value.length;
				if(textnum >= 100) {
					$("#textNum").css("color", "red");
				} else {
					$("#textNum").css("color", "#ccc");
				}

				$("#textNum").html(textnum + "/100")

			}