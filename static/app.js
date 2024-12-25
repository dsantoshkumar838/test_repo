document.getElementById("buy-button").addEventListener("click", function () {
  const symbol = document.getElementById("symbol").value;
  const quantity = document.getElementById("quantity").value;

  fetch("/api/trade", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ symbol, quantity, action: "buy" }),
  })
    .then(response => response.json())
    .then(data => updatePortfolio(data));
});

document.getElementById("sell-button").addEventListener("click", function () {
  const symbol = document.getElementById("symbol").value;
  const quantity = document.getElementById("quantity").value;

  fetch("/api/trade", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ symbol, quantity, action: "sell" }),
  })
    .then(response => response.json())
    .then(data => updatePortfolio(data));
});

function updatePortfolio(data) {
  const tableBody = document.getElementById("portfolio-table").getElementsByTagName('tbody')[0];
  tableBody.innerHTML = "";  // Clear existing rows

  data.portfolio.forEach(item => {
    const row = tableBody.insertRow();
    row.insertCell(0).textContent = item.symbol;
    row.insertCell(1).textContent = item.quantity;
    row.insertCell(2).textContent = item.price;
    row.insertCell(3).textContent = "Sell";  // Implement sell button here if necessary
  });
}

