(function (window, document) {

    var layout   = document.getElementById('layout'),
        menu     = document.getElementById('menu'),
        menuLink = document.getElementById('menuLink'),
        content  = document.getElementById('main');

    function toggleClass(element, className) {
        var classes = element.className.split(/\s+/),
            length = classes.length,
            i = 0;

        for(; i < length; i++) {
          if (classes[i] === className) {
            classes.splice(i, 1);
            break;
          }
        }
        // The className is not found
        if (length === classes.length) {
            classes.push(className);
        }

        element.className = classes.join(' ');
    }

    function toggleAll(e) {
        var active = 'active';

        e.preventDefault();
        toggleClass(layout, active);
        toggleClass(menu, active);
        toggleClass(menuLink, active);
    }

    menuLink.onclick = function (e) {
        toggleAll(e);
    };

    content.onclick = function(e) {
        if (menu.className.indexOf('active') !== -1) {
            toggleAll(e);
        }
    };

}(this, this.document));


function openCity(cityName) {
    var i;
    var x = document.getElementsByClassName("city");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none"; 
    }
    document.getElementById(cityName).style.display = "block"; 
}


function createChartBox(header){

	var checkEl = document.getElementById(header);
	
	if(checkEl === null){
	var d = document.createElement("div");
	var bh = document.createElement("div");
	var bb = document.createElement("div");
	var btool = document.createElement("div");
	var bodyc = document.createElement("div");
	
	var h = document.createElement("h3");
	var btnc = document.createElement("button"); 
	var btnr = document.createElement("button");
	var ip = document.createElement("i");
	var it = document.createElement("i");
	
	//take care of classes for the box div elements
	d.classList.add('box');
	d.classList.add('box-primary');
	d.classList.add('collapsed-box');
	d.id = header;
	
	bh.classList.add('box-header');
	bh.classList.add('with-border');
	
	bb.classList.add('box-body');
	
	btool.classList.add('box-tools');
	btool.classList.add('pull-right');
	
	h.classList.add('box-title');
	h.innerHTML = header;
	
	btnr.classList.add('btn');
	btnr.classList.add('btn-box-tool');
	
	btnc.classList.add('btn');
	btnc.classList.add('btn-box-tool');
	
	it.classList.add('fa');
	it.classList.add('fa-times');
	
	ip.classList.add('fa');
	ip.classList.add('fa-plus');
	
	//Append Head content
	btnr.appendChild(it);
	btnc.appendChild(ip);
	
	btool.appendChild(btnc);
	btool.appendChild(btnr);
	
	bh.appendChild(h);
	bh.appendChild(btool);
	
	d.appendChild(bh);
	d.appendChild(bb);
	
	//Append Body content
	bodyc.innerHTML = "asdagareaasss"
	bb.appendChild(bodyc);
	
	
	document.getElementsByClassName("pure-u-13-24")[0].appendChild(d);
	
	addBoxHandlers();
	}
}



function addRowHandlers() {
	var tbl = document.getElementsByTagName("table");
	
	for(j = 0; j < tbl.length; j++){
		var rows = tbl[j].getElementsByTagName("tr");
		
		for (i = 0; i < rows.length; i++) {
			var currentRow = tbl[j].rows[i];
			var createClickHandler = 
				function(row) 
				{
					return function() { 
                                        var cell = row.getElementsByTagName("td")[0];
                                        var id = cell.innerHTML;
                                        
										createChartBox(id);
										
										
                                 };
            };

        currentRow.onclick = createClickHandler(currentRow);
    }
	}
	
    
}
window.onload = addRowHandlers();



function collapseBox(el){

	var b = el.parentElement.parentElement.parentElement.parentElement;


	b.classList.add('collapsed-box')
	el.classList.remove('fa-minus');
	el.classList.add('fa-plus');

}

function appendBox(el){
	
	var b = el.parentElement.parentElement.parentElement.parentElement;
	
	b.classList.remove('collapsed-box')
	el.classList.remove('fa-plus');
	el.classList.add('fa-minus');

}

function removeBox(el){
	var b = el.parentElement.parentElement.parentElement.parentElement;
	
	b.remove();

}

function boxAction(el){
			
			
			return function(){
			
			if(el.classList.contains('fa-plus')){
				appendBox(el);
			}
			else if(el.classList.contains('fa-minus')){
				collapseBox(el);
			}
			else if(el.classList.contains('fa-times')){
				removeBox(el);
			}
			};
		}



function addBoxHandlers() {
    var table = document.getElementsByClassName("fa");
	
		
	for(i = 0; i < table.length; i++){
		
		
		table[i].parentElement.onclick = boxAction(table[i]);
		
	}
    
}
window.onload = addBoxHandlers();

