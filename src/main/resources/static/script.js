// script.js
document.addEventListener("DOMContentLoaded", function () {
    fetchParticipants();
});

function enrollParticipant() {
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    const batch = document.getElementById("batch").value;

    const participant = {
        name: name,
        age: age,
        batch: batch
    };

    fetch("http://localhost:8080/api/participants/enroll", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(participant),
    })
        .then(response => response.json())
        .then(data => {
            console.log(data); // Handle response from backend
            fetchParticipants(); // Fetch updated participant list
            clearForm();
        })
        .catch(error => {
            console.error("Error:", error);
        });
}

function fetchParticipants() {
    fetch("https://localhost:8080/api/participants")
        .then(response => response.json())
        .then(data => {
            const participantList = document.getElementById("participantList");
            participantList.innerHTML = "";
            data.forEach(participant => {
                const listItem = document.createElement("li");
                listItem.textContent = `${participant.name} (Age: ${participant.age}, Batch: ${participant.batch})`;
                participantList.appendChild(listItem);
            });
        })
        .catch(error => {
            console.error("Error fetching participants:", error);
        });
}

function clearForm() {
    document.getElementById("name").value = "";
    document.getElementById("age").value = "";
    document.getElementById("batch").value = "";
}
