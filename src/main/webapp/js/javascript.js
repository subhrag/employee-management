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
	
	$('.btn-add-employee').on('click', function(event){
		event.preventDefault();
		
		if($('.inpt-emp-name').val() == ""){
			alert('Employee Name is required !');
			$('.inpt-emp-name').focus();
			return;
		}
		if($('.inpt-org-name').val() == ""){
			alert('Organization name is required !');
			$('.inpt-org-name').focus();
			return;
		}
		
		$('.main-form').submit();
	});
	
});
