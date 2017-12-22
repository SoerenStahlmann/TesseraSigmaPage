var ctx = document.getElementById('myChart').getContext('2d');
var chart = new Chart(ctx, {
    // The type of chart we want to create
    type: 'line',

    // The data for our dataset
    data: {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
        datasets: [{
            label: "Leitzins",
            backgroundColor: 'rgb(66, 220, 163)',
            borderColor: 'rgb(255, 99, 132)',
            data: [0, 10, 5, 2, 20, 30, 45],
        }]
    },

    // Configuration options go here
    options: {
		maintainAspectRatio: false
	}
});

var ctx = document.getElementById('myChart2').getContext('2d');
var chart = new Chart(ctx, {
    // The type of chart we want to create
    type: 'line',

    // The data for our dataset
    data: {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
        datasets: [{
            label: "Arbeitslosigkeit",
            backgroundColor: 'rgb(66, 220, 163)',
            borderColor: 'rgb(255, 99, 132)',
            data: [9.4, 8.9, 8.4, 7.6, 7.9, 6.8, 6],
        }]
    },

    // Configuration options go here
    options: {
		maintainAspectRatio: false
	}
});