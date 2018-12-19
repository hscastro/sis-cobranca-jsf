$('#confirmacaoExclusaoModal').on('show.bs.modal', function (event) {
  
	
	var buttom = $(event.relatedTarget);
	
	var codigoTitulo = buttom.data('codigo');
 
	var modal = $(this);
	var form = modal.find('form');
	var action = form.data('url-base');
	
	if(! action.endsWith('/')){
		action+='/';
	}
	
	form.attr('action', action + codigoTitulo);
	
})