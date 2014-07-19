$(document).ready(function(){
	$.ajax({
		type: "GET",
		url: "http://localhost:9090/spring-rest/example/2",
		success: function(data){
			$('.example-pk').append(data.pk);
			$('.example-member1').append(data.member1);
			$('.example-member2').append(data.member2);
		}
	});



	//example POST
	// $.ajax({
	// 	type: "POST",
	// 	contentType: "application/json; charset=utf-8",
	// 	url: "http://localhost:8080/clm-fusion/event/consume",
	// 	data: JSON.stringfy(eventData),
	// 	success: function(data) {
	// 		alert(1);
	// 	}
	// });

});