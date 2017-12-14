var Chart = require('Chart.js');

$.getJSON(www.tessera-sigma.de/api/tester, function (json) {
  // will generate array with ['Monday', 'Tuesday', 'Wednesday']
  var labels = json.map(function(item) {
    return item.id;
  });
  var datas = json.map(function(item){
	 return item.interest; 
  });

  var data = {
    labels: labels,
    datasets: [
    {
      label: "My First dataset",
      fillColor: "rgba(220,220,220,0.5)",
      strokeColor: "rgba(220,220,220,0.8)",
      highlightFill: "rgba(220,220,220,0.75)",
      highlightStroke: "rgba(220,220,220,1)",
      data: datas
    }]};

  var ctx = document.getElementById("myChart").getContext("2d");
  ctx.canvas.width = 1000;
  ctx.canvas.height = 800;

  var myChart = new Chart(ctx).Bar(data);
});