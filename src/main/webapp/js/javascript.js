//using jquery
$(document).ready(function() {

	$('.addition').click(function(event) {
		$(".index-form").attr('action', 'employee-entry');
		$(".index-form").submit();
	});

	$('.view').click(function(event) {
		$(".index-form").attr('action', 'get-employee');
		$(".index-form").submit();
	});

	$('.back-button').click(function(event) {
		$(".back-button-form").submit();
	});

	$('#employeeTable').DataTable();
});
